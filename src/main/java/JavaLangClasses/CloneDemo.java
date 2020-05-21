package JavaLangClasses;

/**
 * A method 'clone()' is used to make a copy of the Object which calls this
 * method. Just objects which implement the Cloneable interface can be cloned.
 * Cloning is not safe. Cloneable objects must have the same types.
 *
 * @author Bohdan Skrypnyk
 */
class TestClone implements Cloneable {

    int a;
    double b;

    TestClone cloneTest() {
        try {
            // call a method 'clone()' from a class 'Object'
            return (TestClone) super.clone();

        } catch (CloneNotSupportedException ex) {

            System.out.println("Impossible to clone");
            return this;
        }
    }

}

public class CloneDemo {

    public static void main(String args[]) {
        TestClone x1 = new TestClone();
        TestClone x2;

        x1.a = 10;
        x1.b = 20.39;

        x2 = x1.cloneTest(); // clone an object 'x1'

        System.out.println("x1 : " + x1.a + " " + x1.b);
        System.out.println("x2 : " + x2.a + " " + x2.b);
    }
}
