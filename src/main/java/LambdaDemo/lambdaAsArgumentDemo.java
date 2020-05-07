package LambdaDemo;

/**
 * The functional interface is an interface with one method. Lambda expressions
 * didn't work individually, they implement (define behavior) of 'abstract'
 * method with the return type, which defined in the functional interface. So,
 * lambda expression and return type of the functional interface should be
 * similar. lambda block is similar to the method body.
 *
 * @author Bohdan Skrypnyk
 */
// functional interface.
interface SomeFunc1 {

    String func(String str);
}

public class lambdaAsArgumentDemo {

    // the first parameter has interface type 'SomeFunc1'.
    // so lambda expression can be passed through this parameter
    private static String stringOp(SomeFunc1 fc, String str) {

        // second parameter 'str' passed to the functional method
        return fc.func(str);
    }

    public static void main(String args[]) {
        String inStr = "Lambda is an effective instrument in java.";
        String outStr;

        System.out.println("Source string : " + inStr);

        // through method 'stringOp()' passed simle lambda expression, as the first param.
        // and string, as a second parameter.
        outStr = stringOp((str) -> inStr.toUpperCase(), inStr);
        System.out.println("String in upper case : " + outStr);

        // lambda block expression, which deletes spaces in the string 
        outStr = stringOp((str) -> {
            String result = "";

            for (int i = 0; i < str.length(); i++) {// to check each char

                if (str.charAt(i) != ' ') { // if char, not equal space 

                    result += str.charAt(i);// add it to parameter 'result' 
                }
            }
            return result;
        }, inStr); // the second parameter 'inStr' defines a string, which will use the lambda expression

        System.out.println("String without spaces : " + outStr);
        
        // define 'reverse', as a link to the instance of the interface 
        SomeFunc1 reverse = (str) -> {
            String result = "";

            for (int i = str.length() - 1; i > 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        
        // pass a link 'reverse' to the method 'stringOp()'
        System.out.println("String without spaces : " + stringOp(reverse, outStr));
    }
}
