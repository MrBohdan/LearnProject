package InterfaceDemo;

/**
 *
 * @author Bohdan Skrypnyk
 */
class DynStack implements IntStack {

    private int stk[];
    private int tol;

    // Allocate size of the stack
    DynStack(int size) {
        stk = new int[size];
        tol = -1;
    }

    //method to push numbers into stack
    public void push(int item) {
        if (tol == stk.length - 1) {
            int temp[] = new int[stk.length * 2]; // extend size of stack
            for (int i = 0; i < stk.length; i++) {
                temp[i] = stk[i];
            }
            stk = temp;
            stk[++tol] = item;

        } else {
            stk[++tol] = item;
        }
    }

    //method to extract numbres from stack
    public int pop() {
        if (tol < 0) {
            return 0;
        } else {
            return stk[tol--];
        }
    }
}

public class IfTest2 {

    public static void main(String args[]) {
        DynStack dynstack = new DynStack(2);
        DynStack dynstack2 = new DynStack(4);
        //Allocate numbers in stack
        for (int i = 0; i < 5; i++) {
            dynstack.push(i);
        }
        for (int i = 0; i < 15; i++) {
            dynstack2.push(i);
        }
        //Print numbers from stack
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
