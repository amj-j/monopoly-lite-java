package cards.chance_cards;

import utils.IOmanager;

public class CarRepairChCard extends ChanceCard {
    private final int MONEY_AMOUNT = 2000;

    @Override
    public void printCard() {
        IOmanager.println("Your car is broken! You need to pay for repair " + MONEY_AMOUNT + "!");
    }
}
