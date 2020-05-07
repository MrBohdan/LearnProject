package LambdaDemo;

/**
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
