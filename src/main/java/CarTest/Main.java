package CarTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFile.fileReader();
        //EnterRegDetailsTest.enterRegDetails(WordSeparator.separator(new File("car_input.txt")));
        EnterRegDetailsTest mainInstance = new EnterRegDetailsTest();
        mainInstance.setUp();
        mainInstance.enterRegDetails("DN09HRM");
    }
}


