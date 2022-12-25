package game;

import utils.Constants;

public class Player {
    Board board;
    String name;
    int money = Constants.INIT_MONEY;
    int imprisoned = 0;

    public Player(String name, Board board) {
        this.board = board;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int getImprisoned() {
        return imprisoned;
    }

    public boolean lost() {
        if (money < 0) return true;
        else return false;
    }
}
