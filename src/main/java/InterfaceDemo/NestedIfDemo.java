package InterfaceDemo;

/**
 *
 * @author Bohdan Skrypnyk
 */
class A {

    public interface NestedIF {

        boolean isNotNegative(int x);
    }
}

class B implements A.NestedIF {

    @Override
    public boolean isNotNegative(int x) {
        return (x > 0) ? true : false;
    }

}

public class NestedIfDemo {

    public static void main(String args[]) {
        A.NestedIF nestedif = new B();
        if (nestedif.isNotNegative(15)) {
            System.out.println("Number is not negative");
        }
        if (nestedif.isNotNegative(-12)) {
            System.out.println("will not be printed");
        }
    }
}
