package JavaLangClasses;

import java.io.IOException;

/**
 * A method 'exec()' is used to call another system which need to run.
 *
 * @author Bohdan Skrypnyk
 */
public class ExecDemoFini {

    public static void main(String args[]) throws InterruptedException {
        Runtime rn = Runtime.getRuntime();

        Process pr = null;

        try {
            pr = rn.exec("NotePad");
            pr.waitFor(); // wait until the process will be closed
        } catch (IOException ex) {
            System.out.println("Error");
        }

        // a method 'exitValue()' return value from a closed process 
        // usually '0'
        System.out.println("Process return value" + pr.exitValue());
    }
}
