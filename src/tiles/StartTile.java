package tiles;

import utils.IOmanager;
import utils.Constants;

import game.Player;

public class StartTile extends Tile {

    @Override
    public void steppedOn(Player player) {
        IOmanager.println("You stepped on start, you get " + Constants.STEP_ON_START_MONEY);
        player.giveMoney(Constants.STEP_ON_START_MONEY);
    }

}
