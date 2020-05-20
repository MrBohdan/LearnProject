package JavaLangClasses;

/**
 * Class Double is used for the numbers with floating-point. double = 15 decimal
 * digits \ float = 7 decimal digits.
 *
 * The methods 'isInfinite()' and 'isNaN()' is used check equality between
 * numbers with floating-point.
 *
 * A method 'isInfinite()' is used to return a type boolean 'true' if number is
 * infinity large or small.
 *
 * A method 'isNaN()' is used to return a type boolean 'true' if a checked value
 * is not a numerical.
 *
 * @author Bohdan Skrypnyk
 */
public class InfNan {

    public static void main(String args[]) {

        // initialize an instance of the type Double
        Double d1 = new Double(1 / 0.);

        Double d2 = new Double(0 / 0.);

        System.out.println(d1 + " : " + d1.isInfinite() + ", " + d1.isNaN());

        System.out.println(d2 + " : " + d2.isInfinite() + ", " + d2.isNaN());
    }
}
