package JavaLangClasses;

/**
 * Class Double is used for the numbers with floating-point. double = 15 decimal
 * digits \ float = 7 decimal digits.
 *
 * @author Bohdan Skrypnyk
 */
public class DoubleDemo {

    public static void main(String args[]) {

        // initialize an instance of the type Double
        Double d1 = new Double(3.447451);

        Double d2 = new Double(3.447451E-5);

        System.out.println(d1 + " = " + d2 + " -> " + d1.equals(d2));
    }
}
