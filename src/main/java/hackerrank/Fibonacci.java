package hackerrank;

import java.util.Scanner;

public class Fibonacci {

    public static int count(int N, int inp) {

        int f1 = 0, f2 = 1, sumOfTwo = 0;

        for (int a = 1; a <= inp; a++) {  // Fn = Fn-1 + Fn-2
            sumOfTwo = f1 + f2; // get a sum of 2 previous numbers
            f1 = f2;  // assign next number as first
            f2 = sumOfTwo;  // assign sum of the previous two as the second number
        }

        return sumOfTwo; // retunr sum
    }

    public static void main(String[] args) {

        Scanner myNumber = new Scanner(System.in); // to get input data

        System.out.println("Enter Wich N number to display: ");

        int inp = myNumber.nextInt();

        System.out.println("N number is: " + count(inp, inp));
    }
}
