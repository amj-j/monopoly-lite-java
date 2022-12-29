package game;

public class Transaction {
    
    public static void transferMoney(Player from, Player to, int amount) {
        from.takeMoney(amount);
        to.giveMoney(amount);
    }

    
}
