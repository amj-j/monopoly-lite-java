package cards.chance_cards;

import utils.IOmanager;

import game.Player;

public class BirthdayChCard extends ChanceCard {
    private static final int MONEY_AMOUNT = 1000;

    @Override
    public void playCard(Player player) {
        IOmanager.println("You have birthday TODAY, you get " + MONEY_AMOUNT + ".");
        IOmanager.readEnter("claim money");
        player.giveMoney(MONEY_AMOUNT);
    }
}
