package cards.chance_cards;

import player.*;
import utils.IOmanager;

public class TaxChCard extends ChanceCard{
    private static final int MONEY_PERCENTAGE = 20;
    
    @Override
    public void playCard(Player player) {
        IOmanager.println("You need to pay " + MONEY_PERCENTAGE + "% of your money as taxes!");
        int moneyToPay = (player.getMoney()*MONEY_PERCENTAGE)/100;
        IOmanager.println("It is " + moneyToPay + "!");
        IOmanager.readEnter("pay");
        Banker.payToBank(player, moneyToPay);
    }
}
