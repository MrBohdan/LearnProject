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
public class IfTest3 {

    public static void main(String args[]) {
        IntStack mystack;
        DynStack ds = new DynStack(2);
        FixedStack fs = new FixedStack(10);

        mystack = ds;
        System.out.println("DynStack");
        for (int i = 0; i < 8; i++) {
            mystack.push(i);
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(mystack.pop());
        }

        mystack = fs;
        System.out.println("FixedStack");
        for (int i = 0; i < 10; i++) {
            mystack.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(mystack.pop());
        }
    }
}
