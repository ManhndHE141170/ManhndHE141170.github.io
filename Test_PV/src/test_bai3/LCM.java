package test_bai3;

/**
 *
 * @author Duy Manh
 */
import java.util.Scanner;

public class LCM {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Enter a = ");
        int a = scanner.nextInt();
        System.out.print("Enter b = ");
        int b = scanner.nextInt();
        // USCLN of a and b
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
        // BSCNN of a and b
        System.out.println("BSCNN của " + a + " và " + b
                + " là: " + BSCNN(a, b));
    }

    /**
     * Find USCLN
     *
     * @param a: integer
     * @param b: integer
     * @return USCLN of a and b
     */
    public static int USCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return USCLN(b, a % b);
    }

    /**
     * Find BSCNN
     *
     * @param a: integer
     * @param b: integer
     * @return BSCNN of a and b
     */
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
