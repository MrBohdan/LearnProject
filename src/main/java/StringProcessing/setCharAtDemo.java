package StringProcessing;

/**
 *
 * @author Bohdan Skrypnyk
 */
public class setCharAtDemo {

    public static void main(String args[]) {
        StringBuffer st = new StringBuffer("Hello");

        // display buffer before changes
        System.out.println("Buffer before : " + st);

        // display char at selected index, before changes
        System.out.println("char at index (1) : " + st.charAt(1));

        st.setCharAt(1, 'a'); // set new char at entered index
        st.setLength(3); // limit the length of the string

        // display buffer after changes
        System.out.println("Buffer after : " + st);

        // display char at selected index, after changes
        System.out.println("char at index (1) : " + st.charAt(1));
    }
}
