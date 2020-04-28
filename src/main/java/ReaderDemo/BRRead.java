package ReaderDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Bohdan Skrypnyk
 */
public class BRRead {

    public static void main(String args[]) {
        try {

            char c;
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter any symbol\nor press c to exit");

            do {
                //the method read symbols from the input stream and return it as the integer
                //char used to convert unicode
                c = (char) bf.read();

            } while (c != 'c');// the system will loop until the user press character 'c'
        } catch (IOException ex) {
            System.out.println("Exception");
        }
    }
}
