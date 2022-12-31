package tiles;

import utils.IOmanager;
import utils.Constants;

import player.*;

public class StartTile extends Tile {

    @Override
    public void steppedOn(Player player) {
        IOmanager.println("You stepped on start, you get " + Constants.STEP_ON_START_MONEY);
        IOmanager.readEnter("claim money");
        Banker.getFromBank(player, Constants.STEP_ON_START_MONEY);
    }

}
