package MethodRefDemo;

/**
 * Method reference operator '::' working similar to Lambda expressions. They
 * both just call a method\constructor\ an instance method.
 *
 * @author Bohdan Skrypnyk
 */
// functional interface
interface StringFunc {

    String func(String str);
}

class MyStringOps {

    // The static method, which reverses words in the string.
    static String strReverse(String str) {
        String newStr = "";

        // Get word length and start counting from the end.
        for (int i = str.length() - 1; i > 0; i--) {
            newStr += str.charAt(i);// display characters by index
        }

        return newStr;
    }
}

public class MethodReferDemo {

    // The first parameter has interface type 'SomeFunc',
    // so any instance of the interface 'StringFunc'
    // can be passed through this parameter.
    static String stringOp(StringFunc fnc, String str) {
        // second parameter 'str' passed to the functional method
        return fnc.func(str);
    }

    public static void main(String args[]) {
        String inStr = "Lambda expression is an important instrument of the java.";
        String outStr;

        // The first argument in the method 'stringOp' 
        // is a reference to the static method 'strReverse'.
        // It is possible, because of a return type of the method 'strReverse' 
        // same with interface context. 
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Source string : " + inStr);
        System.out.println("Reversed string : " + outStr);

        // same with a lambda expression
        outStr = stringOp((str) -> MyStringOps.strReverse(str), inStr);

        System.out.println("(Lambda) Source string : " + inStr);
        System.out.println("(Lambda) Reversed string : " + outStr);
    }
}
