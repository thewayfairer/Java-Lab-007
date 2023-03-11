/**
 * Author: Ricky G
 * CIS 12
 * Date: 03\10\2023
 */
import java.util.Scanner;

/**
 * The ReWrites class contains rewritten versions of while loops
 * in the sumRewrite() and avgRewrite() methods.
 */
class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    /**
     * The avgRewrite method calculates the average of numbers entered
     * using a while loop with a break condition.
     */
    public static void avgRewrite() {
        String l;
        double sum = 0.0;
        int count = 0;
        System.out.println("This program will calculate the average of numbers entered. Begin entering and enter \"Q\" to quit.");
        while(true) {
            l = s.nextLine();
            if (l.toUpperCase().equals("Q")) {
                break;
            }
            try {
                sum += Integer.parseInt(l);
                count++;
            } catch (NumberFormatException nfe) {}
        }
        System.out.printf("Average is: %f%n", (sum/count));
    }

    /**
     * The sumRewrite method adds positive integers entered by the user
     * until 0 is entered, using a for loop.
     */
    public static void sumRewrite() {
        Scanner in = new Scanner(System.in);
        System.out.println("Type positive integers to sum. To stop, type 0...");
        int sum = 0;

        for (int x = -1; x != 0;) {
            try {
                x = Integer.parseInt(in.nextLine());
                if (x <= 0) {
                    continue;
                }
                System.out.println("Adding " + x);
                sum += x;
            } catch (NumberFormatException nfe) {}
        }

        System.out.printf("Sum: %d%nGood Bye%n", sum);
    }

    public static void main(String[] args) {
        avgRewrite();
        sumRewrite();
    }
}
