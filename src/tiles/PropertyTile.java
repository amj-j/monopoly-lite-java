package tiles;

import game.Player;

public class PropertyTile extends Tile {
    final String name;
    final int price;
    final int stayCost;

    Player owner;

    public PropertyTile(String name, int price, int stayCost) {
        this.name = name;
        this.price = price;
        this.stayCost = stayCost;       
    }

    
}
