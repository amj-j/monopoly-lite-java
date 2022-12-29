package cards.chance_cards;

import utils.IOmanager;

public class TaxChCard extends ChanceCard{
    private static final int MONEY_PERCENTAGE = 20;
    
    @Override
    public void printCard() {
        IOmanager.println("You need to pay " + MONEY_PERCENTAGE + "% of your money as taxes!");
    }
}
