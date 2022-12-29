package cards.chance_cards;

import utils.IOmanager;

public class CompetitionWinnerChCard extends ChanceCard {
    private static final int MONEY_AMOUNT = 3000;
    
    @Override
    public void printCard() {
        IOmanager.println("You WIN in LOL competition, you get " + MONEY_AMOUNT + ".");
    }
}
