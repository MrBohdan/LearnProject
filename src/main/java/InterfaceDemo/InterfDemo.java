package InterfaceDemo;

/**
 * Class which implement Interface should have/implement all methods from
 * interface.
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
