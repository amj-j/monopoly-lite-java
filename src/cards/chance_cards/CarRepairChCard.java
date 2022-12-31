package cards.chance_cards;

import player.*;
import utils.IOmanager;

public class CarRepairChCard extends ChanceCard {
    private static final int MONEY_AMOUNT = 2000;

    @Override
    public void playCard(Player player) {
        IOmanager.println("Your car is broken! You need to pay for repair " + MONEY_AMOUNT + "!");
        IOmanager.readEnter("pay");
        Banker.payToBank(player, MONEY_AMOUNT);
    }
}
