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
interface MyFunc {

    int func(int n);
}

public class VarCapture {

    public static void main(String args[]) {
        // a local variable which will be capture by a lambda expression 
        int num = 10;

        MyFunc myLambda = n -> {

            int v = num + n;

            // will throw an error, bc local variable from a lambda expression.
            // must be final 
            //num++;
            return v;
        };

        System.out.println("My lambda : " + myLambda.func(20));

        // will throw an error, bc local variable from a lambda expression.
        // must be final 
        //num = 9;
    }
}
