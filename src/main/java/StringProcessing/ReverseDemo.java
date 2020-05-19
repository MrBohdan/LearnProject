package StringProcessing;

/**
 * A method 'reverse()' is used to reverse a given string.
 *
 * @author Bohdan Skrypnyk
 */
public class ReverseDemo {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Java");

        sb.reverse();

        System.out.println(sb);
    }
}
