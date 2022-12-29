package tiles;

import utils.IOmanager;

import game.Player;

public class PayTaxTile extends Tile {
    public static final int MONEY_AMOUNT = 500;

    @Override
    public void steppedOn(Player player) {
        IOmanager.println("You have to pay a " + MONEY_AMOUNT + " tax!");
        player.takeMoney(MONEY_AMOUNT);
    }
}
