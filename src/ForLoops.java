/**
 * Author: Ricky G
 * CIS 12
 * Date: 03\10\2023
 */
import java.util.Scanner;

/**
 * This class contains methods that demonstrate the use of for loops.
 */
public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    /**
     * Calculates the sum of 1+2+3+...+n, where n is entered by the user.
     * Outputs the sum to the console.
     */
    public static void forSum() {
        System.out.print("Number? ");
        int n = s.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }

    /**
     * Sums a range/interval of numbers entered by the user, and prints the range.
     * Outputs the sum to the console.
     */
    public static void rangeSum() {
        System.out.print("Number? ");
        int n1 = s.nextInt();
        System.out.print("Number? ");
        int n2 = s.nextInt();

        int min = Math.min(n1, n2);
        int max = Math.max(n1, n2);
        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);
        System.out.println("The sum in the above example is the result of: " + getRangeString(min, max));
    }

    /**
     * Calculates the factorial of a number entered by the user.
     * Outputs the factorial to the console.
     */
    public static void factorial() {
        System.out.print("Number: ");
        int n = s.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }

    /**
     * Returns a string representation of the range of numbers between min and max, inclusive.
     * E.g. if min=3 and max=8, returns "3 + 4 + 5 + 6 + 7 + 8"
     */
    private static String getRangeString(int min, int max) {
        StringBuilder sb = new StringBuilder();
        for (int i = min; i <= max; i++) {
            sb.append(i);
            if (i < max) {
                sb.append(" + ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
