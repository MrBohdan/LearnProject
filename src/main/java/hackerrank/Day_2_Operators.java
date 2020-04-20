package hackerrank;

import java.util.*;

/**
 *
 * @author Bohdan Skrypnyk
 */
public class Day_2_Operators {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        float sum_tip_percent = (float) meal_cost * tip_percent / 100;
        System.out.println("sum_tip_percent " + sum_tip_percent);
        float sum_tax_percent = (float) meal_cost * tax_percent / 100;
        System.out.println("sum_tax_percent " + sum_tax_percent);
        int sumCost = Math.round(sum_tip_percent + sum_tax_percent + (float) meal_cost);
        System.out.println("sumCost " + sumCost);
        System.out.println(sumCost);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
