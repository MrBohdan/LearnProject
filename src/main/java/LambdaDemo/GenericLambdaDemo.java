package LambdaDemo;

/**
 * The functional interface is an interface with one method. Lambda expressions
 * didn't work individually, they implement (define behavior) of 'abstract'
 * method with the return type, which defined in the functional interface. So,
 * lambda expression and return type of the functional interface should be
 * similar. lambda block is similar to the method body.
 *
 * Lambda expression cannot be generic, but a functional interface can be
 * generic.
 *
 * @author Bohdan Skrypnyk
 */
// Generic functional interface
interface SomeFunc<T> {

    T func(T t);
}

public class GenericLambdaDemo {

    public static void main(String args[]) {
        // this block expression return reversed word.
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            
            // get word length and start counting from the end.
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i); // display characters by index
            }
            return result;
        };

        // display the method 'reverse.func("")'.
        System.out.println("Reversed word 'Java' :  " + reverse.func("Java"));
        System.out.println("Reversed word 'Experience' :  " + reverse.func("Experience"));

        // the lambda block expression, which count factorial of the 'n'.
        SomeFunc<Integer> factorial = (num) -> {
            int result = 1;

            for (int i = 1; i <= num; i++) {
                result = result * i; // n! = 1×2×3×4×...×n
            }
            return result; // block lamda expression must have the return method.
        };

        // display factorial of the number 2.
        System.out.println("Factorial : 2!  =  " + factorial.func(2));
        // display factorial of the number 8.
        System.out.println("Factorial : 8!  =  " + factorial.func(8));
    }
}
