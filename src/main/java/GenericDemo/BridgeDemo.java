package GenericDemo;

/**
 *
 * @author Bohdan Skrypnyk
 */
class Generic<T> {

    T obj; // initialize an object of type 'T'

    public Generic(T obj) {
        this.obj = obj;
    }
    // getter for 'objc'
    public T getObj() {
        return obj;
    }

}

// subclass of the 'Generic' class
class Generic1 extends Generic<String> {

    public Generic1(String obj) {
        super(obj);
    }

    @Override
    public String getObj() {
        System.out.println("Method called by 'String getObj()'");
        return obj;
    }
}

// example of bridge method 
public class BridgeDemo {

    public static void main(String args[]) {
        // create an object of the type 'Generic1' for strings
        Generic1 g = new Generic1("TEXT VALUE");

        System.out.println(g.getObj());
    }
}
