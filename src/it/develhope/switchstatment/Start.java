package it.develhope.switchstatment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        /**
         * Creating a new List
         */

        List<String> list = new ArrayList<>();

        /**
         * Generating a WHILE infinite Loop
         */

        while (true) {

            System.out.println("Hi, welcome! Type a string:");

            /**
             * Declaring the variables
             */

            Scanner scanner = new Scanner(System.in);
            String userString = scanner.nextLine();

            /**
             * Using a SWITCH state to verify and apply the command
             */

            switch (userString) {
                case "size":
                    System.out.println("The list size is " + list.size());
                    break;
                case "clear":
                    list.clear();
                    System.out.println("Roger! I cleared the list! The new list size is " + list.size());
                    break;
                case "print":
                    System.out.println("Printing the list: " + list);
                    break;
                default:
                    list.add(userString);
                    System.out.println("Added the new element, here's the updated list: " + list);
            }

            System.out.println("------------------------------------------------");
        }
    }
}

