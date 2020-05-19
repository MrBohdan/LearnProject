package StringProcessing;

/**
 * A method 'equal()' compare symbols from the objects, whereas operator '=='
 * check if two references belong to one instance.
 *
 * @author Bohdan Skrypnyk
 */
public class EqualsNotEqualsTo {

    public static void main(String args[]) {
        String s1 = "Java";
        String s2 = new String(s1);

        // check if strings have the same symbols 
        System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2));

        // check is strings belong to the same instance
        System.out.println(s1 + " (s1 == s2) " + s2 + " -> " + (s1 == s2));
        System.out.println(s1 + " (s1 == s1) " + s1 + " ->" + (s1 == s1));
    }
}
