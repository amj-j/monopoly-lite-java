package cards.chance;

import people.Player;
import utils.IOmanager;

public class GoToJailChCard extends ChanceCard {
    
    @Override
    public void playCard(Player player) {
        IOmanager.println("You are arrested! Go to jail!");
        IOmanager.readEnter("continue");
        player.goToJail();
    }
}
