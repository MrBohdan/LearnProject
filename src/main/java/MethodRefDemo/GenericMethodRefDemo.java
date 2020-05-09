package MethodRefDemo;

/**
 * Method reference operator '::' working similar to Lambda expressions. They
 * both just call a method\constructor\ an instance method.
 *
 * @author Bohdan Skrypnyk
 */
// functional interface to process massive of 'T' and return int.
interface MyFunc1<T> {

    int func(T[] t, T v);
}

class MyArrayOps {

    // this method return amount of the elements in the massive,
    // which equal to the specified value.
    static <T> int countMatching(T[] t, T v) {

        int count = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] == v) {
                count++;
            }
        }
        return count;
    }
}

public class GenericMethodRefDemo {

    // The first parameter has functional interface type 'MyFunc1',
    // second parameter is a massive of the type 'T', 
    // the third parameter has the type 'T'.
    static <T> int myOp(MyFunc1<T> fo, T[] t1, T v) {
        return fo.func(t1, v);
    }

    public static void main(String args[]) {
        Integer[] val = {1, 2, 3, 4, 4, 6, 5, 3, 4};
        String[] str = {"One", "Two", "Three", "Two"};

        int count;

        // Not necessary to set type 'T' in the reference on the generic methods,  
        // it will be defined automatically.
        count = myOp(MyArrayOps::countMatching, val, 4);
        count = myOp(MyArrayOps::<Integer>countMatching, val, 4);
        System.out.println(count);

        count = myOp(MyArrayOps::<String>countMatching, str, "Two");
        System.out.println(count);

        // same with a lambda expression
        count = myOp((t, v) -> MyArrayOps.countMatching(t, v), val, 4);
        System.out.println("(Lambda) " + count);

        count = myOp((t, v) -> MyArrayOps.countMatching(t, v), str, "Two");
        System.out.println("(Lambda) " + count);
    }
}
