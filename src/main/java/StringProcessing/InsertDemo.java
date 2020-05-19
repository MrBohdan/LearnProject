package StringProcessing;

/**
 * A method 'insert()' is used to insert a string at the selected index.
 *
 * @author Bohdan Skrypnyk
 */
public class InsertDemo {

    public static void main(String args[]) {

        StringBuffer sb = new StringBuffer("Learn java");

        sb.insert(3, "SSS");

        System.out.println(sb);
    }
}
