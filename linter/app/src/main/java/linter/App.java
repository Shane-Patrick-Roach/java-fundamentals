package linter;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;


public class App {


    public static void main(String[] args) {
        Path gatesPath = Paths.get("./gates.js");
        System.out.println(gatesPath.toAbsolutePath());

//        Scanner gatesScanner = null;
        Scanner gatesScanner = new Scanner("/Users/shaneroach/projects/401/java-fundamentals/linter/app/src/main/resources/gates.js");

        System.out.println(gatesScanner);
//        try {
//            gatesScanner = new Scanner(gatesPath);
//        }
//        catch (IOException ioe) {
//            ioe.printStackTrace();
//            System.out.println("This file cannot be scanned");
//            //System.exit(1);
//        }
//        finally {
//            System.out.println("hello");
//        }

        HashMap<String, Integer> errorsMap = new HashMap<>();
        String[] errorString = {";","return"};

        while(gatesScanner.hasNextLine()){
            String currentLine = gatesScanner.nextLine();
            for (String error : errorString){
                if (currentLine.contains(error)){
                    if (!errorsMap.containsKey(error)){
                        errorsMap.put(error, 1);
                    } else {
                        int currentCount = errorsMap.get(error);
                        errorsMap.put(error, currentCount + 1);
                    }
                }
            }
        }

        System.out.println(errorsMap);
    }
}
