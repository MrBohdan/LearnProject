package StringProcessing;

/**
 *
 * @author Bohdan Skrypnyk
 */
public class StringBufferDemo {

    public static void main(String args[]) {
        StringBuffer st = new StringBuffer("Hello");

        // display string 
        System.out.println("Buffer : " + st);

        // display the length of the string
        System.out.println("Length : " + st.length());

        // StringBuffer() reserve 16 symbols, 
        // so the capacity counted 5 symbols of the string 
        // plus 16 reserved symbols = 21.
        System.out.println("Capacity : " + st.capacity());

        // reverse string
        System.out.println("Reverse : " + st.reverse());
    }
}
