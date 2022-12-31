package cards.chance_cards;

import player.*;
import utils.IOmanager;

public class CompetitionWinnerChCard extends ChanceCard {
    private static final int MONEY_AMOUNT = 3000;
    
    @Override
    public void playCard(Player player) {
        IOmanager.println("You WIN in LOL competition, you get " + MONEY_AMOUNT + ".");
        IOmanager.readEnter("claim your prize");
        Banker.getFromBank(player, MONEY_AMOUNT);
    }
}
