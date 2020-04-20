package hackerrank;

import java.util.*;

/**
 *
 * @author Bohdan Skrypnyk
 */
public class Java_End_of_file {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String inp = "";
        int i = 0;
        while (scan.hasNext()) {
            inp = scan.nextLine();
            i++;
            System.out.println(i + " " + inp);
        }
    }
}
