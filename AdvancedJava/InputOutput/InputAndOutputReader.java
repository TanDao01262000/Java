package com.AdvancedJava.InputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputAndOutputReader {

    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\tankh\\OneDrive\\Documents\\tab_file.txt";
        String file1 = "C:\\Users\\tankh\\OneDrive\\Documents\\Testing.txt";
        FileReader reader = null;
        FileWriter writer = null;
        try {
        reader = new FileReader(file);
        writer = new FileWriter(file1, true);

        int text;
//        while ((text = reader.read()) != -1){
//            writer.write((char) text );
//            }
            writer.append("This is added from java");
        }
         finally{

            if (reader != null){
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
