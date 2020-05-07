package GenericDemo;

/**
 * A generic type can be restricted, by type of class or/and one to many
 * interface types (by using logical operator AND). Keyword 'extends' to set the
 * upper boundaries. Keyword 'super' to set the lover boundaries.
 *
 * In the generic classes, methods can be overridden, as in usual classes
 *
 * @author Bohdan Skrypnyk
 */
class MyGen<T> {

    T obj;// object of the type 'T'

    public MyGen(T obj) {
        this.obj = obj;
    }

    // getter for 'obj'
    T getObj() {
        System.out.println("Method 'getObj()' from the class 'MyGen'");
        return obj;
    }
}

class MyGen2<T> extends MyGen<T> {

    public MyGen2(T obj) {
        super(obj);
    }

    // override getter from the class 'MyGen'
    @Override
    T getObj() {
        System.out.println("Method 'getObj()' from the class 'MyGen2'");
        return obj;
    }
}

public class OverrideDemo {

    public static void main(String args[]) {
        // create an object of the type 'MyGen' for integers
        MyGen<Integer> obj1 = new MyGen<Integer>(15);

        // create an object of the type 'MyGen2' for strings
        MyGen2<String> obj2 = new MyGen2<String>("obj2");

        // create an object of the type 'MyGen2' for integers
        MyGen2<Integer> obj3 = new MyGen2<Integer>(8);

        System.out.println(obj1.getObj());
        System.out.println(obj2.getObj());
        System.out.println(obj3.getObj());
    }
}
