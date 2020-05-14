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
interface CallBack {

    void callback(int param);
}

class Client implements CallBack {

    @Override
    public void callback(int param) {
        System.out.println("Method callback(); , called with variable : " + param);
    }

    //We can declare methods which is not in interface 
    public void notInterfaceMethod() {
        System.out.println("Not interface method");
    }
}

class AnotherClient implements CallBack {

    @Override
    public void callback(int param) {
        System.out.println("One more way of method callback();");
        System.out.println("param in ^2 = " + (param * param));
    }

}

/**
 * This class do not use callback method from interface, that why Incomplete
 * class is abstract. Any other class which extends Incomplete class, should
 * implement callback method from interface or be assigned as abstract.
 */
abstract class Incomplete implements CallBack {

    int a, b;

    void show() {
        System.out.println(a + "" + b);
    }

}

public class InterfDemo {

    public static void main(String args[]) {
        CallBack callback = new AnotherClient();
        Client сlient = new Client();

        callback.callback(15);

        callback = сlient;

        callback.callback(20);
    }
}
