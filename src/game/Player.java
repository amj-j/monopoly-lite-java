package game;

import utils.Constants;
import utils.IOmanager;

public class Player {
    private String name;
    private int position = 0;
    private int money = Constants.INIT_MONEY;
    private int imprisoned = 0;


    public Player(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int getMoney() {
        return money;
    }

    public int getImprisoned() {
        return imprisoned;
    }


    public void move(int steps) {
        position += steps;
        if (position >= Constants.TILES_NUM) {
            position -= Constants.TILES_NUM;
            if (position != Constants.TILES_NUM) {
                passedStart();
            }
        }
        Board.getInstance().tiles[this.position].steppedOn(this);
    }

    public void moveTo(int tileNum, boolean backwards) {
        int previousPosition = position;
        position = tileNum;
        if (!backwards) {
            if (previousPosition >= position) {
                passedStart();
            }
        }
        Board.getInstance().tiles[this.position].steppedOn(this);
    }

    private void passedStart() {
        IOmanager.println("You passed start, you get " + Constants.PASS_START_MONEY);
        IOmanager.readEnter("claim money");
        giveMoney(Constants.PASS_START_MONEY);
    }

    public void goToJail() {
        moveTo(Constants.JAIL_TILE_INDEX, true);
        imprisoned = Constants.ROUNDS_IN_JAIL;
        IOmanager.println("You are improsioned for " + Constants.ROUNDS_IN_JAIL + "rounds!");
        IOmanager.readEnter("continue");
    }


    public void giveMoney(int amount) {
        money += amount;
    }

    public void takeMoney(int amount) {
        money -= amount;
    }


    public boolean lost() {
        if (money < 0) return true;
        else return false;
    }
}
