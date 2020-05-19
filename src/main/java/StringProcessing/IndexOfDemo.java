package StringProcessing;

/**
 * A method indexOf() search for a first symbol or sub-string. A method
 * lastIndexOf() search for a last symbol or sub-string.
 *
 * @author Bohdan Skrypnyk
 */
public class IndexOfDemo {

    public static void main(String args[]) {
        String str = "Renewable energy is energy that is collected from renewable resources, "
                + "which are naturally replenished on a human timescale, such as sunlight,"
                + " wind, rain, tides, waves, and geothermal heat.";

        System.out.println(str);

        System.out.println("indexOf(t) = " + str.indexOf('t'));

        System.out.println("lastindexOf(t) = " + str.lastIndexOf('t'));

        System.out.println("indexOf(is) = " + str.indexOf("is"));

        System.out.println("lastindexOf(is) = " + str.lastIndexOf("is"));

        System.out.println("indexOf(t, 10) = " + str.indexOf('t', 10));

        System.out.println("lastindexOf(t, 10) = " + str.lastIndexOf('t', 10));

        System.out.println("indexOf(is, 10) = " + str.indexOf("is", 10));

        System.out.println("lastindexOf(is, 10) = " + str.lastIndexOf("is", 10));
    }

}
