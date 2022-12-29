package utils;

public class Constants {
    public static final int MAX_PLAYERS = 5;
    public static final int MIN_PLAYERS = 2;
    public static final int MAX_DICE_NUM = 6;
    public static final int MIN_DICE_NUM = 1;

    //Following constants must be divisible by four!
    public static final int TILES_NUM = 24;
    public static final int PROPERTIES_NUM = 16;
    public static final int CHANCES_NUM = 4;

    public static final int ARM_SIZE = TILES_NUM/4 - 1;
    public static final int JAIL_TILE_INDEX = TILES_NUM/4;
    public static final int PAY_TAX_TILE_INDEX = (TILES_NUM/4)*2;
    public static final int GO_TO_JAIL_TILE_INDEX = (TILES_NUM/4)*3;

    public static final int ROUNDS_IN_JAIL = 2;
    public static final int INIT_MONEY = 20000;
    public static final int PASS_START_MONEY = 1000;
    public static final int STEP_ON_START_MONEY = 1000; 
    //when stepped on start, player gets both PASS_START_MONEY and STEP_ON_START_MONEY
    public static final int TAX_TILE_MONEY = 500;
    public static final int LEAVE_JAIL_MONEY = 500;
}
