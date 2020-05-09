package LambdaDemo;

/**
 * The functional interface is an interface with one method. Lambda expressions
 * didn't work individually, they implement (define behavior) of 'abstract'
 * method with the return type, which defined in the functional interface. So,
 * lambda expression and return type of the functional interface should be
 * similar.
 *
 * @author Bohdan Skrypnyk
 */
// functional interface 
interface NumericTest {

    boolean test(int a, int b);
}

public class LambdaDemo1 {

    public static void main(String args[]) {

        // create reference 'isFactor' to the functional interface.
        NumericTest isFactor;

        // the expression checks if a number 'b' is a factor of 'a' 
        isFactor = (a, b) -> (a % b) == 0;

        if (isFactor.test(10, 2)) {
            System.out.println("Number 2 is a factor of 10");
        }
        if (!isFactor.test(11, 3)) {
            System.out.println("Number 3 is not a factor of 11");
        }
    }
}
