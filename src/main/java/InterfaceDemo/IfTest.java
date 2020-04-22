package InterfaceDemo;

/**
 *
 * @author Bohdan Skrypnyk
 */
interface IntStack {

    void push(int item); // push element to stack

    int pop(); // extract from stack

    //usualy used to generate exeptions
//    default void clean() {
//        throw new UnsupportedOperationException("Method is not implemented");
//    }
    /**
     *
     * @defult and @static methods no need to implement in the classes, which
     * implements interface IntStack
     */
    static int getDefultNumber() {
        return 50;
    }
}

class FixedStack implements IntStack {

    private int stk[];
    private int tos;

    // Allocate size of the stack
    public FixedStack(int size) {
        stk = new int[size];
        tos = -1;
    }

    //method to push numbers into stack
    @Override
    public void push(int item) {
        if (tos == stk.length - 1) {
            System.out.println("Stack is full");
        } else {
            stk[++tos] = item;
        }
    }

    //method to extract numbres from stack
    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is not loaded");
            return 0;
        } else {
            return stk[tos--];
        }
    }
}

public class IfTest {

    public static void main(String args[]) {
        FixedStack fixedstack1 = new FixedStack(5);
        FixedStack fixedstack2 = new FixedStack(10);
        //Allocate numbers in stack
        for (int i = 0; i < 5; i++) {
            fixedstack1.push(i);
        }
        for (int i = 0; i < 10; i++) {
            fixedstack2.push(i);
        }

        //Print numbers from stack
        System.out.println("fixedstack1");
        for (int i = 0; i < 5; i++) {
            System.out.println(fixedstack1.pop());
        }
        System.out.println("fixedstack2");
        for (int i = 0; i < 10; i++) {
            System.out.println(fixedstack2.pop());
        }
        //fixedstack2.clean();
        int defnum = IntStack.getDefultNumber();
        System.out.println("IntStack.getDefultNumber() = " + defnum);
    }
}
