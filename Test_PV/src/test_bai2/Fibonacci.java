/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_bai2;

import java.util.Scanner;

/**
 *
 * @author Duy Manh
 */
public class Fibonacci {
    private final static Scanner sc = new Scanner(System.in); 
    
    
    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        int n = getNumber("Enter number n : ") ;
        int fibo = 0;
        for (int i = 0; i < n; i++) {
            if(fibonacci(i) % 2 == 1){
                fibo += fibonacci(i);
            }
        }
        System.out.print("Result : " + fibo);
    }
    
    
    /**
      *
      * @param n: index of fibonacci number from 0
      * eg: F0 = 0, F1 = 1, F2 = 1, F3 = 2
      * @return nth fibonacci number
      */
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    
    /**
     * input number
     * @param mess
     * @return 
     */
    public static int getNumber(String mess){
        int number = 0;
        while(true){
            try {
                System.out.print(mess);
                number = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid number, please input again");
            }
        }
        return number;
    }
}
