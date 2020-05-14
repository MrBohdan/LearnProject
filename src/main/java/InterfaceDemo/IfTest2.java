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
// implementation of the dynamic stack
class DynStack implements IntStack {

    private int stk[];
    private int tail;

    // allocate size of the stack
    DynStack(int size) {
        stk = new int[size];
        tail = -1; 
    }

    // method to push numbers into stack
    @Override
    public void push(int item) {
        if (tail == stk.length - 1) { // if the last index equal to stack size  
            int temp[] = new int[stk.length * 2]; // extend size of stack
            for (int i = 0; i < stk.length; i++) {
                temp[i] = stk[i]; // move items from stack to a temporary stack
            }
            stk = temp; // move items back to a stack 
            stk[++tail] = item; // add an item to extended stack 

        } else {
            stk[++tail] = item; // add item to stack 
        }
    }

    // method to extract numbres from stack
    @Override
    public int pop() {
        if (tail < 0) { 
            return 0;
        } else {
            return stk[tail--];
        }
    }
}

public class IfTest2 {

    public static void main(String args[]) {

        DynStack dynstack = new DynStack(2);
        DynStack dynstack2 = new DynStack(4);

        // allocate numbers in stack
        for (int i = 0; i < 5; i++) {
            dynstack.push(i);
        }
        for (int i = 0; i < 15; i++) {
            dynstack2.push(i);
        }

        // print numbers from stack
        System.out.println("dynstack");
        for (int i = 0; i < 5; i++) {
            System.out.println(dynstack.pop());
        }
        System.out.println("dynstack2");
        for (int i = 0; i < 15; i++) {
            System.out.println(dynstack2.pop());
        }
    }
}
