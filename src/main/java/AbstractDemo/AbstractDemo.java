package AbstractDemo;

/**
 * The keyword 'abstract' is a non-access modifier. Abstract class working in a
 * similar way as the superclass, so the subclass should implement all methods
 * from abstract class or be abstract. Any class which has more than one
 * abstract method must be initialized as abstract. Abstract classes cannot be
 * used to create objects, so the instance of the not be received by using the
 * keyword 'new'. Abstract methods cannot be static and constructors cannot be
 * abstract. The difference with the interface, that abstract classes can have
 * abstract and regular methods together. Moreover, in the abstract can be
 * declared variables, in the interface they should be final.
 *
 * @author Bohdan Skrypnyk
 */
// create an abstract class 
abstract class A {

    abstract void callme();

    // Abstract classes can contain "simple" methods But abstract classes don't
    // use static methods and don't allow receive Objects (Ex: C c = new C();).
    // Sub-Classes should implement
    void callmetoo() {
        System.out.println("Just a method");
    }
}

class B extends A {

    // the subclass must implement all abstract methods from the abstract class 
    // or has a 'abstract' modifier
    @Override
    void callme() {
        System.out.println("Method callme(), from class B");
    }
}

public class AbstractDemo {

    public static void main(String args[]) {

        // the subclass has access to all methods/variables/constructor
        // of the abstract class
        B b = new B();

        b.callme();
        b.callmetoo();
    }
}
