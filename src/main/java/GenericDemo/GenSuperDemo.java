package GenericDemo;

/**
 * A generic type can be restricted, by type of class or/and one to many
 * interface types (by using logical operator AND). Keyword 'extends' to set the
 * upper boundaries. Keyword 'super' to set the lover boundaries.
 *
 * @author Bohdan Skrypnyk
 */
class Gener<T> {

    T obj; // object of the type 'T'

    // the constructor receive an object of the type 'T' 
    public Gener(T obj) {
        this.obj = obj;
    }

    // getter for 'obj'
    public T getObj() {
        return obj;
    }

}

// subclass of the 'Gener' class
// the class 'Gener2' used generic type just to support superclass
class Gener2<T, V> extends Gener<T> {

    V obj1;

    // the class 'Gener2' receive generic objects 
    public Gener2(T obj, V obj2) {
        super(obj);
        this.obj1 = obj2;
    }

    // getter for 'obj1'
    public V getObj2() {
        return obj1;
    }
}

public class GenSuperDemo {

    public static void main(String args[]) {
        // type wich passed to the class 'Gener2' 
        // will be also passed to superclass 'Gener' 
        Gener2<Integer, String> gener2 = new Gener2<Integer, String>(5, "Gener2 param");

        System.out.println("Object 1 type : " + gener2.obj.getClass().getName() + " Value: " + gener2.obj);
        System.out.println("Object 2 type : " + gener2.obj1.getClass().getName() + " Value: " + +gener2.obj);
    }
}
