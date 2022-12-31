package tiles;

import people.*;
import utils.IOmanager;

public class PayTaxTile extends Tile {
    public static final int MONEY_AMOUNT = 500;

    @Override
    public void steppedOn(Player player) {
        IOmanager.println("You have to pay a " + MONEY_AMOUNT + " tax!");
        IOmanager.readEnter("pay");
        Banker.payToBank(player, MONEY_AMOUNT);
    }
}
