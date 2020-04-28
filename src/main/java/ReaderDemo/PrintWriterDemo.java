package ReaderDemo;

import java.io.PrintWriter;

/**
 * PrintWriter class support 'print()' and 'println()' methods, so there is no
 * much difference when use it with 'System.out' or 'PrintWriter'.
 *
 * @author Bohdan Skrypnyk
 */
public class PrintWriterDemo {

    public static void main(String args[]) {

        // 'PrintWriter' convert not primitive data types to String 
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("baseline");

        int a = - 7;

        pw.println(a);

        double d = 4.7e-7;

        pw.println(d);
    }
}
