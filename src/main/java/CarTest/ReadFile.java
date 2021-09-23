package CarTest;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static String fileReader() throws FileNotFoundException {
        String inputFileName = "car_input.txt";
        File inputFile = new File(inputFileName);
        Scanner input = new Scanner(inputFile);

        StringBuilder sb = new StringBuilder("");

        while (input.hasNext()) {
            String line = input.nextLine();
            String[] lineArray = line.split("\n");
            for (String s : lineArray) {
                sb.append(s + " ");
            }
        }
        return sb.toString();
    }
}
