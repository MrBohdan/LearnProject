package JavaLangClasses;

import java.io.IOException;

/**
 * A method 'exec()' is used to call another system which need to run.
 *
 * @author Bohdan Skrypnyk
 */
public class ExecDemo {

    public static void main(String args[]) {
        Runtime rn = Runtime.getRuntime();

        Process pr = null;

        try {
            // a method 'exec()' return a type Process
            pr = rn.exec("NotePad"); // run NotePud
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}
