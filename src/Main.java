import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        try {
            FileHandler fh = new FileHandler("%h/myJavaLog.log");
            logger.addHandler(fh);
            logger.setLevel(Level.ALL);

        } catch (SecurityException e) {
            logger.log(Level.INFO,
                    "Error 1", e);
        } catch (IOException e) {
            logger.log(Level.INFO,
                    "Error 2", e);
        }
        int[] array = new int[]{28, 12, 6, 40, 21, 18, 45, 34};
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    sorted = false;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
}
