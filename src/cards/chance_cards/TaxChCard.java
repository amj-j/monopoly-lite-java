package cards.chance_cards;

import utils.IOmanager;

import game.Player;

public class TaxChCard extends ChanceCard{
    private static final int MONEY_PERCENTAGE = 20;
    
    @Override
    public void printCard(Player player) {
        IOmanager.println("You need to pay " + MONEY_PERCENTAGE + "% of your money as taxes!");
        int moneyToTake = (player.getMoney()*MONEY_PERCENTAGE)/100;
        player.takeMoney(moneyToTake);
    }
}
