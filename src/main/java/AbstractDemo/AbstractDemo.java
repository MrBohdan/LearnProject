package AbstractDemo;

/**
 * Abstract class working in the same way as the superclass, so the subclass
 * should implement all methods from abstract class or be abstract. Any class
 * which has more than one abstract method must be initialized as abstract.
 * Abstract classes cannot have any objects, so the instance of the abstract
 * class cannot be received by using the keyword 'new'. Abstract methods cannot
 * be static and constructors cannot be abstract.
 *
 * @author Bohdan Skrypnyk
 */
abstract class A {

    abstract void callme();

    /**
     *
     * Abstract classes can contain "simple" methods But abstract classes don't
     * use static methods and don't allow receive Objects (Ex: C c = new C();).
     * Sub-Classes should implement
     *
     */
    void callmetoo() {
        System.out.println("Just a method");
    }
}

class B extends A {

    @Override
    void callme() {
        System.out.println("Method callme(), from class B");
    }
}

public class AbstractDemo {

    public static void main(String args[]) {
        B b = new B();

        b.callme();
        b.callmetoo();
    }
}
