package InterfaceDemo;

/**
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
