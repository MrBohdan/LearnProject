package JavaLangClasses;

/**
 *
 * @author Bohdan Skrypnyk
 */
public class StringConversions {

    public static void main(String args[]) {
        for (int i = 1; i <= 15; i++) {
            
            // convert numbers into different systems 
            System.out.println(" Num " + i + " in binary system : " + Integer.toBinaryString(i));

            System.out.println(" Num " + i + " in octal system : " + Integer.toOctalString(i));

            System.out.println(" Num " + i + " in hexadecimal system : " + Integer.toHexString(i) + "\n");
        }
    }
}
