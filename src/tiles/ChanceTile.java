package tiles;

import utils.IOmanager;

import game.Board;
import people.Player;
import cards.Card;

public class ChanceTile extends Tile {

    @Override
    public void steppedOn(Player player) {
        Board board = Board.getInstance();
        IOmanager.println("You stepped on Chance, draw a Chance card!");
        IOmanager.readEnter("draw a Chance card");
        Card card = board.chanceDeck.takeFromTop();
        card.playCard(player);
        board.chanceDeck.addToBottom(card);      
    }
}
