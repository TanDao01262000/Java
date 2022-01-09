package com.AdvancedJava.Serialization;

import java.io.*;

public class Main {
    public static void main(String[] ars) throws FileNotFoundException {
        Student student = new Student("Thuan", 21, "Sai Gon");
        student.setX(7);
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;
        String fileName = "C:\\Users\\tankh\\OneDrive\\Documents\\SerializationFile.txt";

        // Serialization
        try {
            // writing an object to a file, java wil automatically serialize the object
            fileOut = new FileOutputStream(fileName);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);
            fileOut.close();
            objOut.close();

            System.out.println("Object has been serialized " + student);

        } catch (IOException e) {
            e.printStackTrace();
        }

//         Deserialization
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;

        try{
            fileIn = new FileInputStream(fileName);
            objIn = new ObjectInputStream(fileIn);
            Student student1 = (Student) objIn.readObject();
            fileIn.close();
            objIn.close();
        System.out.println("Deserialization: " + student1);
            System.out.println("Value of x =    " + student1.getX());
        } catch (IOException e){
            System.out.println("Exception is caught");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


