package LambdaDemo;

// import functional interface
import java.util.function.Function;

/**
 * The functional interface is an interface with one method. Lambda expressions
 * didn't work individually, they implement (define behavior) of 'abstract'
 * method with the return type, which defined in the functional interface. So,
 * lambda expression and return type of the functional interface should be
 * similar.Another way of using functional interfaces is to use the default
 * library 'java.util.function.Function'.
 *
 * Lambda block is similar to the method body and should have a return
 * statement.
 *
 * @author Bohdan Skrypnyk
 */
// functional interface
interface NumericFunction {

    int func(int a);
}

public class BlockLambdaDemo {

    public static void main(String args[]) {

        // The lambda block expression, which counts factorial of the 'n'.
        // lambda block is similar to the method body.
        NumericFunction factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = result * i; // n! = 1×2×3×4×...×n
            }
            return result; // block lambda expression must have the return method.
        };

        // display factorial of the number 3.
        System.out.println("Factorial : 3!  =  " + factorial.func(3));
        // display factorial of the number 6.
        System.out.println("Factorial : 6!  =  " + factorial.func(6));

        // Another way of using functional interfaces is to use the default library
        // 'java.util.function.Function'.
        Function<Integer, Integer> factorialLib = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = result * i; // n! = 1×2×3×4×...×n
            }
            return result; // block lamda expression must have the return method.
        };

        System.out.println("Factorial : 12!  =  " + factorialLib.apply(12));
    }
}
