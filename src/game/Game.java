package game;

import utils.IOmanager;
import utils.Constants;

public class Game {
    Board board = Board.getInstance();

    public Game() {
        gameLoop();
        endOfGame();
    }

    private void gameLoop() {
        while (board.players.size() > 1) {
            round();
        }
    }

    private void round() {
        for (int i = 0; i < board.players.size(); i++) {
            turn(board.players.get(i));   
            int indexOfLostPlayer = checkIfLost();
            if (indexOfLostPlayer != -1) {
                removePlayer(indexOfLostPlayer);
                if (indexOfLostPlayer <= i) {
                    --i;
                }
            }
        }
    }

    private void turn(Player player) {
        IOmanager.println("It's " + player.getName() + "'s turn.");
        IOmanager.println("Your money: " + player.getMoney());
        if (player.getImprisoned() > 0) {
            inJail(player);
        }
        else {
            notInJail(player);
        }
        IOmanager.readEnter("end your turn");
        IOmanager.println("");
    }

    private int rollDice() {
        IOmanager.readEnter("roll dice");
        int diceRoll = board.dice.nextInt(Constants.MAX_DICE_NUM - 1) + Constants.MIN_DICE_NUM;
        IOmanager.println("You rolled " + diceRoll);
        return diceRoll;
    }

    private void notInJail(Player player) {
        int diceRoll = rollDice();
        IOmanager.readEnter("move");
        player.move(diceRoll);
    }

    private void inJail(Player player) {
        IOmanager.println("You are in jail for " + player.getImprisoned() + " more rounds!");
        int diceRoll = rollDice();
        if (diceRoll == Constants.MAX_DICE_NUM) {
            leavingJailPrematurely(player);
        }
        else {
            IOmanager.println("Your roll didn't get you out of jail");
            boolean leave = IOmanager.readYesNo("Do you want to leave jail now for " + Constants.LEAVE_JAIL_MONEY + "?");
            if (leave) {
                leavingJailPrematurely(player);
            }
        }
    }

    private void leavingJailPrematurely(Player player) {
        IOmanager.println("You are out of jail!");
        notInJail(player);
    }

    private int checkIfLost() {
        for (int i = 0; i < board.players.size(); i++) {
            if (board.players.get(i).lost()) {
                return i;
            }
        }
        return -1;
    }

    private void removePlayer(int index) {
        Player lostPlayer = board.players.get(index);
        IOmanager.println(lostPlayer.getName() + " lost");
        board.lostPlayers.add(lostPlayer);
        board.players.remove(index);
        IOmanager.readEnter("continue");
    }

    private void endOfGame() {
        Player winner = board.players.get(0);
        board.players.remove(0);
        board.lostPlayers.add(winner);
        IOmanager.println(winner.getName() + " won!");
        IOmanager.readEnter("continue");
        printLostPlayers();
    }

    private void printLostPlayers() {
        int place = 1;
        for (int i = board.lostPlayers.size() -1; i >= 0; i--) {
            IOmanager.println(place + ". " + board.lostPlayers.get(i));
            place++;
        }
    }
}
