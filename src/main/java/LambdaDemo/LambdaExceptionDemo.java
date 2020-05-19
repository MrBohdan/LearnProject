package LambdaDemo;

/**
 * The functional interface is an interface with one method. Lambda expressions
 * didn't work individually, they implement (define behavior) of 'abstract'
 * method with the return type, which defined in the functional interface. So,
 * lambda expression and return type of the functional interface should be
 * similar.Another way of using functional interfaces is to use the default
 * library 'java.util.function.Function'.
 *
 * @author Bohdan Skrypnyk
 */
// functional interface
interface DoubleNumericArrayFunc {

    // the keyword 'throws' is compulsory
    double func(double[] n) throws EmptyArrayException;

}

class EmptyArrayException extends Exception {

    public EmptyArrayException() {
        super("Empty Massive");
    }
}

public class LambdaExceptionDemo {

    public static void main(String args[]) throws EmptyArrayException {

        double[] nums = {2.3, 4.6, 1.3, 6.9};

        // unacceptable to initialize parameter n as n[],
        // because it used the context of the functional interface
        DoubleNumericArrayFunc average = (n) -> {

            double sum = 0.0;

            // check if the massive is empty or not
            // if true, throw an exception
            if (n.length == 0) {
                throw new EmptyArrayException();
            }

            // count average of the massive of the type double 
            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }

            return sum / n.length;
        };

        System.out.println("Average : " + average.func(nums));

        // will throw an exception, because of empty massive 
        System.out.println("Average : " + average.func(new double[0]));
    }
}
