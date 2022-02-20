package linter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;


public class App {

    String errors;

    public App(String[] arguments) {
        String userPath = System.getProperty("user.dir");
        String resourcesPath = "app/src/main/resources/";
        String fileName = arguments[0];

        if (userPath.endsWith("linter")) {
            resourcesPath = "app/src/main/resources/";
        } else {
            resourcesPath = "src/main/resources/";
        }

        String fullFileName = resourcesPath + fileName;
        Path fileToBeScanned = Path.of(fullFileName);

        Scanner fileScanner = null;

        try {
            fileScanner = new Scanner(fileToBeScanned);
        } catch (IOException e) {
            e.printStackTrace();
            //System.out.println("This file cannot be scanned");
            System.exit(1);
        } finally {
            //System.out.println("File was imported");
        }

        errors = "";
        int lineNumber = 0;

        if (fileScanner.hasNext()) {

            while (fileScanner.hasNextLine()) {


                String line = fileScanner.nextLine();
                lineNumber++;
                if (line.isEmpty()) {
                    continue;
                } else if (line.endsWith("{") || line.endsWith("}")) {
                    continue;
                } else if (line.contains("if") || line.contains("else")) {
                    continue;
                } else if (line.startsWith("//"))
                    continue;


                if (!line.endsWith(";")) {
                    errors += "Line " + lineNumber + ": Missing semicolon.\n";
                }
                if (line.contains("'")) {
                    errors += "Line " + lineNumber + ": Single quote(s) found.\n";
                }
            }

            if (errors.equals("")) {
                errors = "No errors found.\n";
            }
        }

        if (errors.equals("")) {
                errors = "The file is empty.\n";
        }

        }



    @Override
    public String toString(){
        String output = errors + "end";
        return output;
    }

}
