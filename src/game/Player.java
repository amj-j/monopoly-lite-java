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
            throughStart();
        }
    }

    private void throughStart() {
        if (position == 0) {
            steppedOnStart();
        }
        else {
            passedStart();
        }
    }

    private void passedStart() {
        IOmanager.println("You passed start, you get " + Constants.PASS_START_MONEY);
        giveOrTakeMoney(Constants.PASS_START_MONEY);
    }

    private void steppedOnStart() {
        IOmanager.println("You stepped on start, you get " + Constants.STEP_ON_START_MONEY);
        giveOrTakeMoney(Constants.STEP_ON_START_MONEY);
    }


    public void giveOrTakeMoney(int amount) {
        money += amount;
    }

    public void takeMoneyByPercentage(int percentage) {
        int moneyToTake = (money*percentage)/100;
        giveOrTakeMoney(moneyToTake);
    }


    public boolean lost() {
        if (money < 0) return true;
        else return false;
    }
}
