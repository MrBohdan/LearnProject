package JavaLangClasses;

import java.io.IOException;

/**
 * ProcessBuilder allows other ways than the process class to run processes and
 * manipulate them.
 *
 * @author Bohdan Skrypnyk
 */
public class ProcessBuilderDemo {

    public static void main(String args[]) {
        try {
            // will run 'NotePad', as 'newdoc' file
            ProcessBuilder pb = new ProcessBuilder("NotePad", "newdoc");
            pb.start(); // start process
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}
