import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
//        Logger logger = Logger.getLogger(Main.class.getName());
//
//        try {
//            FileHandler fh = new FileHandler("C:\\Users\\comm2\\IdeaProjects\\Java_GB_HW2\\myJavaLog.log", false);
//            logger.addHandler(fh);
//            logger.setLevel(Level.ALL);
//            XMLFormatter xmlFormatter = new XMLFormatter();
//            fh.setFormatter(xmlFormatter);
//
//            int[] array = new int[]{28, 12, 6, 40, 21, 18, 45, 34};
//            boolean sorted = false;
//            while (!sorted) {
//                sorted = true;
//                for (int i = 0; i < array.length - 1; i++) {
//                    if (array[i + 1] < array[i]) {
//                        sorted = false;
//                        int temp = array[i];
//                        array[i] = array[i + 1];
//                        array[i + 1] = temp;
//                    }
//                }
//            }
//            System.out.println(Arrays.toString(array));
//            logger.log(Level.ALL, "element:", Arrays.toString(array));
//        } catch (IOException | SecurityException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
// Задача №2
        System.out.println("Начинается чтение файла...");
        String path = "C:\\Users\\comm2\\IdeaProjects\\Java_GB_HW2\\";
        String str;
        BufferedReader input = new BufferedReader(new FileReader(path + "Students.txt"));
        while (true) {
            try {
                if ((str = input.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(str);
        }
    }
}