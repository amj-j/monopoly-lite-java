package utils;
public abstract class IOmanager {   

    public static void print(String text) {
        System.out.print(text);
    }

    public static void println(String text) {
        System.out.println(text);
    }

    public static void readEnter(String text) {
        KeyboardInput.readString("Press enter to " + text);
    }

    public static int readInt(String text) {
        return KeyboardInput.readInt(text);
    }

    public static String readString(String text) {
        return KeyboardInput.readString(text);
    }

    public static int readIntInRange(int from, int to, String text) {
        int index = readInt(text);
        while (index < from || index >= to) {
            index = readInt("It must be in range [" + from + "; " + to + ")!");
        }
        return index;
    }

    public static boolean readYesNo(String text) {
        String answer = readString(text + " (y or n)");
        while (!(answer.equals("y") || answer.equals("n"))) {
            answer = readString("Enter \"y\" for Yes or \"n\" for No");
        }
        if (answer.equals("y")) {
            return true;
        }
        else {
            return false;
        }
    }
}
