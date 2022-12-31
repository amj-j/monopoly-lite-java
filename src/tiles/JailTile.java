package tiles;

import people.Player;
import utils.IOmanager;

public class JailTile extends Tile {

    @Override
    public void steppedOn(Player player) {
        if (player.getImprisoned() == 0) {
            IOmanager.println("You are on a visit in jail.");
        }
    }
}
