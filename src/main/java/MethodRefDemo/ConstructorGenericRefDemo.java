package MethodRefDemo;

/**
 * Method reference operator '::' working similar to Lambda expressions. They
 * both just call a method\constructor\ an instance method.
 *
 * @author Bohdan Skrypnyk
 */
// functional interface
interface MyFunc2<T> {

    MyClass1<T> func(T t);
}

class MyClass1<T> {

    private T val;

    // constructor with one generic parameter 
    public MyClass1(T val) {
        this.val = val;
    }

    // default constructor 
    public MyClass1() {
        this.val = null;
    }

    // getter for the parameter of the type 'T'
    public T getVal() {
        return val;
    }
}

public class ConstructorGenericRefDemo {

    public static void main(String args[]) {

        // create a reference on the constructor 'MyClass1(T val)' with type 'T' par.,
        // method 'func' receive the type 'T 'parameters
        // from the generic functional interface 'MyFunc2<T>',
        // bc of this operator 'new' refers to the constructor,
        // with type 'T' parameters from the 'MyClass1<T>' class
        MyFunc2<Integer> myfunc = MyClass1<Integer>::new;
        MyClass1<Integer> myclass = myfunc.func(100);

        System.out.println("Val : " + myclass.getVal());

        // not necessary to set return type, it will be selected automatically
        MyFunc2 myfunc1 = MyClass1::new;
        MyClass1 myclass1 = myfunc1.func("Java is an important instrument");

        System.out.println("Val without the predefined type: " + myclass1.getVal());

        // same with a lambda expression
        MyFunc2 myfunc2 = (t) -> new MyClass1(t);
        MyClass1 myclass2 = myfunc2.func(215.655);

        System.out.println("(Lambda) Val : " + myclass2.getVal());
    }
}
