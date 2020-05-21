package JavaLangClasses;

/**
 * Class 'Math' is used for mathematical equations with floating-point.
 *
 * @author Bohdan Skrypnyk
 */
public class Angels {

    public static void main(String args[]) {
        double theta;

        theta = 120.0;

        System.out.println(theta + " angle degree is equal to : " + Math.toRadians(theta) + " radians.");

        theta = 1.112;

        System.out.println(theta + " radians is equal to : " + Math.toDegrees(theta) + "  angle degree.");

        theta = 2;

        System.out.println(theta + " in power of : " + Math.pow(theta, 2));

        theta = 2;
    }
}
