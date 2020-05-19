package StringProcessing;

/**
 * A method 'join()' is used to join two or more strings with a delimiter.
 *
 * @author Bohdan Skrypnyk
 */
public class StirngJoinDemo {

    public static void main(String args[]) {
        String result = String.join(" ", "Alpha", "Beta", "Gamma");

        // display result 
        System.out.println(result);

        result = String.join(", ", "Jhon", "#ID : 1548", "E-mail: jhon@se.com");

        // display result 
        System.out.println(result);
    }
}
