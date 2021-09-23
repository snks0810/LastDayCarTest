package CarTest;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSeparator {

    public static boolean isStringUpperCase(String someString){
        int capitalCounter = 0;
        for(int i = 0; i < 7; i++){
            char item = someString.charAt(i);
            if(Character.isUpperCase(item)){
                capitalCounter++;
            }
        }
        if( capitalCounter == 5){
            return true;}
        else{
            return false;}
    }

    public static void separator(File someFile) throws FileNotFoundException {
        File theFile = someFile;
        File inputFile = new File(String.valueOf(theFile));
        Scanner input = new Scanner(inputFile);

        StringBuilder sb = new StringBuilder("");

        while (input.hasNext()) {
            String word = input.nextLine();
            String[] wordArray = word.split("\\s");
            for (String s : wordArray) {
                //System.out.println(s + " ");
                //sb.append(s + " ");
                if(s.length() == 7 && isStringUpperCase(s)){
                    System.out.println(s + " ");
                }
            }
        }
        //return sb.toString();
    }


}
