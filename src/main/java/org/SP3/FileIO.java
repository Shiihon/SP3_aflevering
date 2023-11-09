package org.SP3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    public static ArrayList <String> loadData (String path)  {
        ArrayList<String> data = new ArrayList<>();

        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                data.add(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        return data;
    }
}
