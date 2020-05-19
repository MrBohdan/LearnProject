package StringProcessing;

/**
 * A method 'append()' is used to connect any type of data to string.
 *
 * @author Bohdan Skrypnyk
 */
public class AppendDemo {

    public static void main(String args[]) {
        String s;
        int a = 42;
        boolean bl = true;
        
        StringBuffer sb = new StringBuffer(a);

        s = sb.append("a = ").append(a).append("!").append(bl).toString();
        
        System.out.println(s);
    }
}
