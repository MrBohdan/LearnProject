package ReaderDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Bohdan Skrypnyk
 */
public class BRReadLines {

    public static void main(String args[]) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str;
            System.out.println("Enter any string or 'stop' to terminate");

            do {
                str = br.readLine(); //method readLine, read input as string
            } while (!str.equals("stop"));

        } catch (IOException ex) {
           System.out.println("Exception");
        }
    }
}
