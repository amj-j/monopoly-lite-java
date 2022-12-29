package tiles;

import utils.IOmanager;

import game.Player;

public class ChanceTile extends Tile {

    @Override
    public void steppedOn(Player player) {
        IOmanager.println("You stepped on Chance, you draw a Chance card!");
    }
}
