package InterfaceDemo;

/**
 * "One Interface multiple implementations". Interfaces cannot be used to create
 * objects. All methods, variables static, and final (constant) by default. All
 * methods in interface usually have empty methods. The subclass should
 * implement all methods from the interface, but each subclass can implement
 * these methods in a different way. To access the different method
 * implementation through interface (Ex: MyInterface obj = new Class()).
 * Interfaces can be nested in the class then they can be public\private.
 *
 * @author Bohdan Skrypnyk
 */
interface A1 {

    void meth1();

    void meth2();
}

// an interface 'B1' extends an interface 'A!'.
// an interface 'B1' now includes all methods from an interface 'A1'
interface B1 extends A1 {

    void meth3();
}

// implement all methods from the interfaces 'B1' amd 'A1'
class C implements B1 {

    @Override
    public void meth2() {
        System.out.println("Message meth2()");
    }

    @Override
    public void meth3() {
        System.out.println("Message meth3()");
    }

    @Override
    public void meth1() {
        System.out.println("Message meth1()");
    }

}

public class IFExtends {

    public static void main(String args[]) {
        B1 b1 = new C();
        b1.meth1();
        b1.meth2();
        b1.meth3();
    }
}
