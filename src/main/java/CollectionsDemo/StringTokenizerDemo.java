package CollectionsDemo;

import java.util.StringTokenizer;

/**
 * Class 'StringTokenizer' divide string to tokens by separator symbols.
 *
 * @author Bohdan Skrypnyk
 */
public class StringTokenizerDemo {

    private static StringTokenizer stringTokinizer;
    private static String str = "City name=New York;"
            + "City state=City in New York State;"
            + "City debt=119.44;";

    public static void main(String args[]) {

        // initialize the 'StringTokenizer'
        stringTokinizer = new StringTokenizer(str, "=;");

        // separate the strings to tokens 
        while (stringTokinizer.hasMoreTokens()) {
            // get tokens
            String key = stringTokinizer.nextToken();
            String val = stringTokinizer.nextToken();

            // display tokens
            System.out.println(key + " " + val);
        }
    }
}
