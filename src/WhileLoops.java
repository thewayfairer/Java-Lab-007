/**
 * Author: Ricky G
 * CIS 12
 * Date: 03\10\2023
 */
import java.util.Scanner;

/**
 * This class contains methods that demonstrate the use of while loops.
 */
public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    /**
     * Reads integers from System.in and counts the even and odd numbers separately.
     * Outputs the count of even and odd numbers to the console.
     */
    public static void eoCount() {
        int evenCount = 0;
        int oddCount = 0;

        // Read integers from System.in until user inputs -1
        System.out.println("Enter integers (enter -1 to stop):");
        int num = s.nextInt();
        while (num != -1) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = s.nextInt();
        }

        // Output counts of even and odd numbers to the console
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }

    /**
     * Reads integers from System.in and calculates the mean of the numbers entered.
     * Outputs the mean to the console.
     */
    public static void mean() {
        int sum = 0;
        int count = 0;

        // Read integers from System.in until user inputs -1
        System.out.println("Enter integers (enter -1 to stop):");
        int num = s.nextInt();
        while (num != -1) {
            sum += num;
            count++;
            num = s.nextInt();
        }

        // Calculate mean and output to the console
        if (count > 0) {
            double mean = (double) sum / count;
            System.out.println("Mean: " + mean);
        } else {
            System.out.println("No input provided.");
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}

