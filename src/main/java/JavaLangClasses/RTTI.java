package JavaLangClasses;

/**
 * The methods which contain a class 'Class' is used to get information about
 * the object. So, these methods allow getting information about constructors/
 * methods / fields.
 *
 * @author Bohdan Skrypnyk
 */
class X {

    int a;
    float b;

    public X(int a, float b) {
        this.a = a;
        this.b = b;
    }

    public X() {
        this.a = -1;
        this.b = -1;
    }
}

class Y extends X {

    double c;

    public Y(double c, int a, float b) {
        super(a, b);
        this.c = c;
    }

    public Y() {
        this.c = -1;
    }
}

public class RTTI {

    public static void main(String args[]) {
        X x = new X();
        Y y = new Y();

        Class<?> claObj;

        claObj = x.getClass(); // get reference on the object

        System.out.println("x is an object of the type :" + claObj.getName());
        try {
            System.out.println("Constructor of the class x :" + claObj.getConstructor());
        } catch (NoSuchMethodException ex) {
            System.out.println("No Such Method ");
        }

        claObj = y.getClass(); // get reference on the object

        System.out.println("y is an object of the type :" + claObj.getName());
        try {
            System.out.println("Constructor of the class y :" + claObj.getConstructor());
        } catch (NoSuchMethodException ex) {
            System.out.println("No Such Method ");
        }

        claObj = claObj.getSuperclass();

        System.out.println("Superclass of an object y :" + claObj.getName());
    }
}
