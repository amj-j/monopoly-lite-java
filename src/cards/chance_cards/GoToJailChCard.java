package cards.chance_cards;

import utils.IOmanager;

import game.Player;

public class GoToJailChCard extends ChanceCard {
    
    @Override
    public void printCard(Player player) {
        IOmanager.println("You are arrested! Go to jail!");
        player.goToJail();
    }
}
