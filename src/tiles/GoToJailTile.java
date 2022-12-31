package tiles;

import people.Player;
import utils.IOmanager;

public class GoToJailTile extends Tile {

    @Override
    public void steppedOn(Player player) {
        IOmanager.println("You are arrested! You are going to jail!");
        IOmanager.readEnter("continue");
        player.goToJail();
    }
}
