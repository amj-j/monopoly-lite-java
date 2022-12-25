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

    public static int readIntInRange(int from, int to, String primaryText, String correctionText) {
        int index = readInt(primaryText);
        while (index < from || index >= to) {
            index = readInt(correctionText);
        }
        return index;
    }
}
