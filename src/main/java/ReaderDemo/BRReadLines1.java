package ReaderDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Bohdan Skrypnyk
 */
public class BRReadLines1 {

    public static void main(String args[]) {

        String str[] = new String[20];

        int b = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {

            // limit the quantity of entered strings 
            for (int i = 0; i < 20; i++) {
                
                // method readLine, read input as string
                str[i] = bf.readLine(); 
                
                b = i;
                
                // terminate the system when the user entered 'stop'
                if (str[i].equals("stop")) {
                    break;
                }
            }

            System.out.println("\n Entered strings \n");

            // display reversed input 
            for (int i = b; i >= 0; --i) {
                // terminate the system when match stop
                if (str[0].equals("stop")) {
                    break;
                }
                System.out.println("> " + str[i]);
            }
        } catch (IOException ex) {
            System.out.println("Exception");
        }
    }
}
