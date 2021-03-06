package EnumDemo;

/**
 * Enum - a special type of class, with constant/final variables. There is no
 * way to create a new instance of enum class by using "new". Enum class cannot
 * be a superclass and cannot inherit from other classes, but it working the
 * same as usual class, so there can be initialized constructors, methods, and
 * so on.
 *
 * @author Bohdan Skrypnyk
 */
enum Apple2 {
    Gala,
    GrannySmith,
    Honeycrisp,
    GoldenDelicious,
    Braeburn,
    RibstonPippin
}

public class EnumDemo2 {

    public static void main(String args[]) {
        Apple2 ap, ap1, ap2;

        System.out.println("All variety of apples and their order num");

        // method 'ordinal()' return order number of const
        for (Apple2 a : Apple2.values()) {
            System.out.println(a + " : " + a.ordinal());
        }
        ap = Apple2.GrannySmith;
        ap1 = Apple2.GoldenDelicious;
        ap2 = Apple2.GrannySmith;

        System.out.println();

        /**
         * method "compareTo(e);" compare order number and return a negative
         * number if caller var has a lower position than 'e'. Otherwise, return
         * positive number
         *
         * if both constant is same, method return 0
         */
        if (ap.compareTo(ap1) < 0) {
            System.out.println(ap + " before " + ap1);
        }

        if (ap.compareTo(ap1) > 0) {
            System.out.println(ap1 + " before " + ap);
        }

        if (ap.compareTo(ap2) == 0) {
            System.out.println(ap + " same place in order with " + ap2);
        }

        System.out.println();

        if (ap.equals(ap1)) {
            System.out.println(" Error ");
        }

        if (ap.equals(ap2)) {
            System.out.println(ap + " same place in order with " + ap2);
        }

        if (ap == ap2) {
            System.out.println(ap + " == " + ap2);
        }
    }
}
