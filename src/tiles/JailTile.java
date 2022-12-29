package tiles;

import utils.IOmanager;

import game.Player;

public class JailTile extends Tile {

    @Override
    public void steppedOn(Player player) {
        IOmanager.println("You are on a visit in jail.");
    }
}
