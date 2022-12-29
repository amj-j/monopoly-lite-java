package cards.chance_cards;

import utils.IOmanager;

public class BirthdayChCard extends ChanceCard {
    private static final int MONEY_AMOUNT = 1000;

    @Override
    public void printCard() {
        IOmanager.println("You have birthday TODAY, you get " + MONEY_AMOUNT + ".");
    }
}
