package org.example;


public class Main {
    public static void main(String[] args) {

        String exampleString = " Rutabaga ";
        String trimmed = exampleString.trim();
        String[] splits = exampleString.split("a");
        for (String split : splits) {
            System.out.println(split);

        }
        System.out.println(trimmed);

    }
}