package InheritanceDemo;

/**
 *
 * @author Bohdan Skrypnyk
 */
class A {

    int i, j;

    void showij() {
        System.out.println("i and j : " + i + " " + j);
    }
}

class B extends A {

    int k;

    void showk() {
        System.out.println("k : " + k);
    }

    void sum() {
        System.out.println("Sum k + i + j = " + (k + i + j));
    }
}

public class SimpleInheritance {

    public static void main(String args[]) {
        A superObj = new A();
        B subObj = new B();

        superObj.i = 20;
        superObj.j = 30;
        System.out.println("subObj contain");
        superObj.showij();
        
        subObj.i = 10;
        subObj.j = 15;
        subObj.k = 50;
        System.out.println("subObj contain");
        subObj.showij();
        subObj.showk();

        subObj.sum();

    }
}
