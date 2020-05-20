package JavaLangClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Bohdan Skrypnyk
 */
public class ParseDemo {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int i;
        int sum = 0;

        System.out.println("Enter '0' to terminate");
        do {
            try {

                // get input from user
                str = br.readLine();

                // A method 'valueOf' is used to convert string to int
                i = Integer.valueOf(str);

                // another example of conversion
                //i = Integer.parseInt(str);
            } catch (NumberFormatException ex) {
                System.out.println("Incorrect format");
                i = 0;
            }
            sum += i; // add entered number to sum 

            System.out.println("Current sum : " + sum);
        } while (i != 0); // will terminate the system if the user entered '0'
    }
}
