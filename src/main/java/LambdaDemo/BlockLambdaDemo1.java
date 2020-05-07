package LambdaDemo;

/**
 * The functional interface is an interface with one method. Lambda expressions
 * didn't work individually, they implement (define behavior) of 'abstract'
 * method with the return type, which defined in the functional interface. So,
 * lambda expression and return type of the functional interface should be
 * similar.
 *
 * Lambda block is similar to the method body and should have a return
 * statement.
 *
 * @author Bohdan Skrypnyk
 */
// functional interface
interface StringFunc {

    String func(String str);
}

public class BlockLambdaDemo1 {

    public static void main(String args[]) {
        // this block expression return reversed word.
        // lambda block is similar to the method body.
        StringFunc reverse = (str) -> {
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
    }
}
