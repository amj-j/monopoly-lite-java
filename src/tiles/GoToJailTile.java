package tiles;

import utils.IOmanager;

import game.Player;

public class GoToJailTile extends Tile {

    @Override
    public void steppedOn(Player player) {
        IOmanager.println("You are arrested! You are going to jail!");
        player.goToJail();
    }
}
