package InterfaceDemo;

/**
 *
 * @author Bohdan Skrypnyk
 */
interface A1 {

    void meth1();
}

interface B1 extends A1 {

    void meth2();

    void meth3();
}

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
