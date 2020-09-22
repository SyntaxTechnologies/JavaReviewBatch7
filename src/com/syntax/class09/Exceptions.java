package com.syntax.class09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {
    public static void main(String[] args) {


        System.out.println("Line number 1");
        System.out.println("Adding two numbers" + (10 + 5));

        File file = new File("C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaReviewBatch7review\\Book1.xlsx");


        try {
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("File exits");
        int arr[] = {10, 20};
        int index = 10;
        if (index >= 0 && index < arr.length) {
            System.out.println(arr[index]);

        } else {
            System.out.println("index out of bound");
        }


        System.out.println("Adding two numbers" + 10 + 5);
        System.out.println("Last line ");
        System.out.println("1000");


    }
}
