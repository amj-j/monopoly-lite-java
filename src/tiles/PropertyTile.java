package tiles;

import utils.IOmanager;

import game.Player;
import game.Transaction;

public class PropertyTile extends Tile {
    final String name;
    final int price;
    final int stayCost;

    Player owner = null;

    public PropertyTile(String name, int price, int stayCost) {
        this.name = name;
        this.price = price;
        this.stayCost = stayCost;       
    }

    @Override
    public void steppedOn(Player player) {
        IOmanager.println("You stepped on " + name + ".");
        if (this.owner == null) {
            IOmanager.println("Nobody owns this property!");
            offerToBuy(player);
        }
        else {
            IOmanager.println(this.owner.getName() + " owns this property!");
            IOmanager.println("You must pay them " + stayCost + "!");
            IOmanager.readEnter("pay");
            Transaction.transferMoney(player, this.owner, stayCost);
        }        
    }

    private void offerToBuy(Player player) {
        boolean buy = IOmanager.readYesNo("Do you want to buy it for " + price + "?");
        if (buy) {
            if (player.getMoney() < price) {
                IOmanager.println("You don't have enough money to buy this property!");
            }
            else {
                player.takeMoney(price);
                this.owner = player;
                IOmanager.println(this.name + " is yours now!");
            }
        }
    }
}
