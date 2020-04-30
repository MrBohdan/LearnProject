package AssertDemo;

/**
 * By default, Java disables assertions.
 *
 * Assert used to verify the correctness of the code in the development process.
 *
 * Assert not working with a maven project?.
 *
 * @author Bohdan Skrypnyk
 */
public class AssertDemo {

    static int val = 3;

    public static int getNum() {
        return val--;
    }

    public static void main(String args[]) {

        int n;

        for (int i = 0; i < 10; i++) {

            n = getNum();
            
            // 'assert' check expression 
            assert n >= 0 : "Assert error, bc " + n + " >= 0";

            System.out.println("n : " + n);
        }
    }
}
