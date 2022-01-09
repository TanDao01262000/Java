package com.AdvancedJava.InputOutput;

import java.io.*;

public class InputAndOutputStream {


        public static void main(String[] args) throws IOException {
            String file = "C:\\Users\\tankh\\OneDrive\\Documents\\Note SQL\\chu thuong.jpg";
            String file1 = "C:\\Users\\tankh\\OneDrive\\Documents\\ImageTesting.jpg";
            FileInputStream inputStream = null;
            FileOutputStream outputStream = null;
            try {
                inputStream = new FileInputStream(file);
                outputStream = new FileOutputStream(file1, true);

                int text;
            while ((text = inputStream.read()) != -1){
                outputStream.write((byte) text );
            }

            }
            finally{

                if (inputStream != null){
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
        }
    }


