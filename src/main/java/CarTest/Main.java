package CarTest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFile.fileReader();
        //EnterRegDetailsTest.enterRegDetails(WordSeparator.separator(new File("car_input.txt")));
        //EnterRegDetailsTest mainInstance = new EnterRegDetailsTest();
        //mainInstance.setUp();
        //mainInstance.enterRegDetails("DN09HRM");

        ArrayList<String> regPlates = WordSeparator.separator(new File("car_input.txt"));
        GetHistoryCheck otherMainInstance = new GetHistoryCheck();
        otherMainInstance.setUp();
        for(String i: regPlates ){
            otherMainInstance.getHistoryCheck(i);
        }
    }
}


