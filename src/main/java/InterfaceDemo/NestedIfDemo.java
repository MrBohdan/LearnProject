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
// class contain nested interface 
class A {

    // nested interface 
    public interface NestedIF {

        boolean isNotNegative(int x);
    }
}

// class implement a nested interface
class B implements A.NestedIF {

    @Override
    public boolean isNotNegative(int x) {
        return (x > 0) ? true : false;
    }

}

public class NestedIfDemo {

    public static void main(String args[]) {
        
        // use reference on the nested interface
        A.NestedIF nestedif = new B();
        
        if (nestedif.isNotNegative(15)) {
            System.out.println("Number is not negative");
        }
        if (nestedif.isNotNegative(-12)) {
            System.out.println("will not be printed");
        }
    }
}
