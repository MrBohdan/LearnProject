package AbstractDemo;

/**
 *
 * @author Bohdan Skrypnyk
 */
abstract class A {

    abstract void callme();

    /**
     *
     * Abstract classes can contain "simple" methods But abstract classes don't
     * use static methods and don't allow receive Objects (Ex: C c
     * = new C();). Sub-Classes should implement
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
