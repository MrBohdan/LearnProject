package StringProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * A method 'trim()' just return value without space before the string.
 *
 * @author Bohdan Skrypnyk
 */
public class UseTrim {

    public static void main(String args[]) {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            String str;

            System.out.println("Enter 'exit' to terminate the system.");
            System.out.println("Enter the name of the state : ");

            do {
                // read input from user
                str = bf.readLine();
                
                // remove space at the beginning of the string 
                str = str.trim();
                if (str.equals("Illinois")) {

                    System.out.println("Springfield is the capital of the U.S. state of Illinois");

                } else if (str.equals("Missouri")) {

                    System.out.println("Jefferson, is the capital of the U.S. state of Missouri");

                } else if (str.equals("Washington")) {

                    System.out.println("Olympia , is the capital of the U.S. state of Washington");

                }
            } while (!str.equals("exit"));

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
