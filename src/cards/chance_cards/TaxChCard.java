package cards.chance_cards;

import utils.IOmanager;

import game.Player;

public class TaxChCard extends ChanceCard{
    private static final int MONEY_PERCENTAGE = 20;
    
    @Override
    public void playCard(Player player) {
        IOmanager.println("You need to pay " + MONEY_PERCENTAGE + "% of your money as taxes!");
        int moneyToTake = (player.getMoney()*MONEY_PERCENTAGE)/100;
        IOmanager.println("It is " + moneyToTake + "!");
        IOmanager.readEnter("pay");
        player.takeMoney(moneyToTake);
    }
}
