package CarTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFile.fileReader();
        WordSeparator.separator(new File("car_input.txt"));
    }
}


