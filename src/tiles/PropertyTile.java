package tiles;

import game.Player;
import game.Board;

public class PropertyTile extends Tile {
    String name;
    int price;
    int stayCost;

    Board board;
    Player owner;

    public PropertyTile(Board board, String name, int price, int stayCost) {
        this.board = board;
        this.name = name;
        this.price = price;
        this.stayCost = stayCost;       
    }
}
