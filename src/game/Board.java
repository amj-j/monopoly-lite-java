package game;

import java.util.ArrayList;
import java.util.Random;

import utils.Constants;
import utils.IOmanager;
import tiles.*;

public class Board {
    public ArrayList<Player> players = new ArrayList<Player>();
    public Tile[] tiles = new Tile[Constants.TILES_NUM];
    public ArrayList<String> lostPlayers = new ArrayList<String>();

    public Board(int playersNum) {
        initPlayers(playersNum);
        initTiles();
    }

    private void initPlayers(int playersNum) {
        String name;
        for (int i = 0; i < playersNum; i++) {
            name = IOmanager.readString("Enter the name of player " + (i+1));
            players.add(new Player(name, this));
        }

    }

    private void initTiles() {
        tiles[0] = new StartTile();
        tiles[Constants.JAIL_TILE_INDEX] = new JailTile();
        tiles[Constants.PAY_TAX_TILE_INDEX] = new PayTaxTile();
        tiles[Constants.GO_TO_JAIL_TILE_INDEX] = new GoToJailTile();

        for (int i = 0; i < 4; i++) {
            initArm(i);
        }
    }

    void initArm(int armNum) {
        ArrayList<Tile> arm = new ArrayList<Tile>();
        for (int i = 0; i < Constants.PROPERTIES_NUM/4; i++) {
            arm.add(new PropertyTile());
        }
        for (int i = 0; i < Constants.CHANCES_NUM/4; i++) {
            arm.add(new ChanceTile());
        }

        Random rand = new Random();
        Tile tmp;
        int armIndex;
        int tilesIndex = (Constants.TILES_NUM/4)*armNum + 1;
        while (!arm.isEmpty()) {
            armIndex = rand.nextInt();
            tmp = arm.get(armIndex);
            arm.remove(armIndex);
            tiles[tilesIndex] = tmp;
            tilesIndex++;
        }
    }
}
