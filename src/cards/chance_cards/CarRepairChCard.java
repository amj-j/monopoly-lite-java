package cards.chance_cards;

import utils.IOmanager;

import game.Player;

public class CarRepairChCard extends ChanceCard {
    private static final int MONEY_AMOUNT = 2000;

    @Override
    public void printCard(Player player) {
        IOmanager.println("Your car is broken! You need to pay for repair " + MONEY_AMOUNT + "!");
        player.giveMoney(MONEY_AMOUNT);
    }
}
