package player;

public class Banker {
    
    public static void transaction(Player from, Player to, int amount) {
        from.money -= amount;
        to.money += amount;
    }

    public static void payToBank(Player player, int amount) {
        player.money -= amount;
    }

    public static void getFromBank(Player player, int amount) {
        player.money += amount;
    }
}
