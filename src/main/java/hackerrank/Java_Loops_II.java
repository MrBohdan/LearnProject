package hackerrank;

import java.util.*;

/**
 *
 * @author Bohdan Skrypnyk
 */
public class Java_Loops_II {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many times to make loop? :");
        long t = in.nextInt();
        for (long i = 0; i < t; i++) {
            System.out.println("First variable :");
            long a = in.nextInt();
            System.out.println("Second variable :");
            long b = in.nextInt();
            System.out.println("How many times to multiply them? :");
            long n = in.nextInt();
            for (long c = 1; c <= n; c++) {
                a += b;
                System.out.print(a + ", ");
                b *= 2;
            }
            System.out.println();
        }
        in.close();
    }
}
