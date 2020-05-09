package MethodRefDemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Method reference operator '::' working similar to Lambda expressions. They
 * both just call a method\constructor\ an instance method.
 *
 * @author Bohdan Skrypnyk
 */
class MyClass {

    private int val;

    public MyClass(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

}

public class UseMethodRef {

    // method 'comparable()' compatible similar with 
    // another method which defined in an interface 'Compatator<T>'.
    public static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String args[]) {
        ArrayList<MyClass> myList = new ArrayList<>();

        myList.add(new MyClass(5));
        myList.add(new MyClass(8));
        myList.add(new MyClass(7));
        myList.add(new MyClass(4));
        myList.add(new MyClass(1));
        myList.add(new MyClass(9));

        // find maximum value using a method 'compareMC()'.
        MyClass maxValObj = Collections.max(myList, UseMethodRef::compareMC);

        System.out.println("Max value : " + maxValObj.getVal());

        // same with a lambda expression 
        maxValObj = Collections.max(myList, (a, b) -> compareMC(a, b));

        System.out.println("Max value : " + maxValObj.getVal());
    }
}
