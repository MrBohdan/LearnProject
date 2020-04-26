package hackerrank;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter Wich N number to display: ");
        int i = myNumber.nextInt();
        int f1 = 0, f2 = 1, f3 = 0;
        for (int a = 1; a <= i; a++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        System.out.println("N number is: " + f3);
    }
}
