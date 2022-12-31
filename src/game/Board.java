package game;

import java.util.ArrayList;
import java.util.Random;

import utils.Constants;
import utils.IOmanager;
import utils.PropertiesGetter;
import tiles.*;

import cards.chance_cards.*;
import player.Player;

public class Board {
    private static Board instance = null;

    public Random dice = new Random();
    public ArrayList<Player> players = new ArrayList<Player>();
    public Tile[] tiles = new Tile[Constants.TILES_NUM];
    public Deck chanceDeck = new Deck();
    public ArrayList<Player> lostPlayers = new ArrayList<Player>();

    private Board() {
        initPlayers();
        initTiles();
        initChanceDeck();
    }

    public static Board getInstance() {
        if (instance == null) {
            instance = new Board();
        }
        return instance;
    }

    private void initPlayers() {
        int playersNum = IOmanager.readIntInRange(
            Constants.MIN_PLAYERS,
            Constants.MAX_PLAYERS,
            "How many players will there be?"   
        );
        String name;
        for (int i = 0; i < playersNum; i++) {
            name = IOmanager.readString("Enter the name of player " + (i+1));
            players.add(new Player(name));
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
        PropertiesGetter propertiesGetter = PropertiesGetter.getInstance();
        ArrayList<Tile> arm = new ArrayList<Tile>();
        for (int i = 0; i < Constants.PROPERTIES_NUM/4; i++) {
            arm.add(propertiesGetter.takePropertyTile());
        }
        for (int i = 0; i < Constants.CHANCES_NUM/4; i++) {
            arm.add(new ChanceTile());
        }

        Random rand = new Random();
        Tile tmp;
        int armIndex;
        int tilesIndex = (Constants.TILES_NUM/4)*armNum + 1;
        while (!arm.isEmpty()) {
            armIndex = rand.nextInt(arm.size());
            tmp = arm.get(armIndex);
            arm.remove(armIndex);
            tiles[tilesIndex] = tmp;
            tilesIndex++;
        }
    }

    private void initChanceDeck() {
        chanceDeck.addToBottom(new BirthdayChCard());
        chanceDeck.addToBottom(new CarRepairChCard());
        chanceDeck.addToBottom(new CompetitionWinnerChCard());
        chanceDeck.addToBottom(new GoToJailChCard());
        chanceDeck.addToBottom(new TaxChCard());
    }
}
