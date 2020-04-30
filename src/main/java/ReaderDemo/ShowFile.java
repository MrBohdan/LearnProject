package ReaderDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * method 'close()' is rudimental, because of 'AutoCloseable' interface
 *
 * @author Bohdan Skrypnyk
 */
public class ShowFile {

    public static void main(String args[]) {

        int i;

        // try to open file
        // at this point, the file is opened and ready to be read
        // method 'read()' read return -1 when reached end of the file
        // Block 'try' will automatically close file input/output
        try (FileInputStream fis = new FileInputStream("README.md");
                FileOutputStream fos = new FileOutputStream("tempREADME.md")) {// create file/open for write

            do {
                i = fis.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);

        } catch (IOException ex) {
            System.out.println("Exception");
        }
    }
}
