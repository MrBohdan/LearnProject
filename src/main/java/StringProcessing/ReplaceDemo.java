package StringProcessing;

/**
 * A method 'replace()' is used to replace part of the string with a substring.
 *
 * @author Bohdan Skrypnyk
 */
public class ReplaceDemo {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Renewable energy is energy that is collected from renewable resources");

        // display string before changing
        System.out.println(sb);

        sb.replace(10, 31, "JAVA"); // replace part of the string with a substring

        // display string after changing
        System.out.println(sb);
    }
}
