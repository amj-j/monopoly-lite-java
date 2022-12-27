package cards.chance_cards;

import utils.IOmanager;
import utils.Constants;

public class GoToJailChCard extends ChanceCard {
    
    @Override
    public void printCard() {
        IOmanager.println("Go to JAIL for " + Constants.ROUNDS_IN_JAIL + " rounds!");
    }
}
