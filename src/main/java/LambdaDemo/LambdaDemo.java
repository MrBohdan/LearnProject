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
interface MyBool {

    boolean test(int n);
}

public class LambdaDemo {

    public static void main(String args[]) {

        // create reference 'mynum' to the functional interface.
        MyBool ckeckIf;

        // lambda expression check if the number is even or not. 
        ckeckIf = (n) -> (n % 2) == 0;

        if (ckeckIf.test(10)) {
            System.out.println("Number 10 is even");
        }
        if (!ckeckIf.test(7)) {
            System.out.println("Number 7 is odd");
        }

        // lambda expression checks if the number is positive. 
        // a lambda expression with one parameter not necessary
        // to enclose in brackets
        ckeckIf = n -> n > 0;

        if (ckeckIf.test(20)) {
            System.out.println("Number 20 is positive");
        }
        if (!ckeckIf.test(-7)) {
            System.out.println("Number -7 is negative");
        }

    }
}
