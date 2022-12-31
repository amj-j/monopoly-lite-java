package cards.chance_cards;

import utils.IOmanager;

import game.Player;

public class CompetitionWinnerChCard extends ChanceCard {
    private static final int MONEY_AMOUNT = 3000;
    
    @Override
    public void playCard(Player player) {
        IOmanager.println("You WIN in LOL competition, you get " + MONEY_AMOUNT + ".");
        IOmanager.readEnter("claim your prize");
        player.giveMoney(MONEY_AMOUNT);
    }
}
