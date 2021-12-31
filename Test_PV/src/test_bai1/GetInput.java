/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_bai1;

import java.util.Scanner;

/**
 *
 * @author Duy Manh
 */
public class GetInput {
    
    private final static Scanner sc = new Scanner(System.in);
    
    /**
     * Validate input
     * @param message
     * @param min
     * @param max
     * @return 
     */
    public static int inputInt(String message, int min, int max) {
        System.out.print(message);
        while (true) {
            String input = sc.nextLine();
            try {
                int numberChoice = Integer.parseInt(input); // parse to int
                if (numberChoice < min || numberChoice > max) { // check if number choice out of range max min
                    System.out.print("Please input between " + min + " and " + max + ": ");
                    continue;
                }
                return numberChoice;
            } catch (NumberFormatException e) {
                System.out.print("Please input an integer number :");
            }
        }
    }
    
    /**
     * get non-empty string
     *
     * @param message
     * @return
     */
    public static String inputString(String message) {
        System.out.print(message);
        while (true) {
            String input = sc.nextLine();
            if (input.equals("")) {
                System.out.print("Please input a non-empty string: ");
                continue;
            }
            return input;
        }
    }
}
