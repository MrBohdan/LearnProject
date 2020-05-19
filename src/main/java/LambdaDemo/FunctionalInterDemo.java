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
// functional method
interface MyNumber {

    // lambda expression will define the behavior of this method 
    double getVal();
}

public class FunctionalInterDemo {

    public static void main(String args[]) {

        // create reference 'mynum' to the functional interface
        MyNumber mynum;

        // lambda expression, the same as a return type of functional interface
        mynum = () -> 55.51;

        // call method 'getVal()'
        System.out.println("Constant value : " + mynum.getVal());

        mynum = () -> Math.random() * 100;

        // call method 'getVal()' with random number
        System.out.println("Constant value : " + mynum.getVal());

        // call method 'getVal()' with random number
        System.out.println("Constant value : " + mynum.getVal());
    }
}
