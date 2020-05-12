package InheritanceDemo;

/**
 * Inheritance is used to create hierarchies of the classes. Superclass define
 * common characteristic for all subclasses, this reduces duplication of the So,
 * each subclass gets characteristics of the superclass and will add its own
 * unique characteristics.
 *
 * @author Bohdan Skrypnyk
 */
// create superclass
class A {

    int i, j;

    void showij() {
        System.out.println("i and j : " + i + " " + j);
    }
}

// create subclass by extending superclass 
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
        A superObj = new A(); // initialize superclass 
        B subObj = new B(); // initialize subclass

        // the superclass can be used independently 
        superObj.i = 20;
        superObj.j = 30;

        System.out.println("subObj contain");
        superObj.showij();

        // the subclass has access to all public members of the superclass
        subObj.i = 10; // variable 'i' belongs to the superclass
        subObj.j = 15; // variable 'j' belongs to the superclass

        subObj.k = 50; // variable 'k' belongs to the subclass

        System.out.println("subObj contain");
        subObj.showij();
        subObj.showk();

        subObj.sum();

    }
}
