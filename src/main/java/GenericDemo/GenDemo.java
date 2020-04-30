package GenericDemo;

/**
 * Generic allows using any type of data for the object
 *
 * @author Bohdan Skrypnyk
 */
// 'T' is the parameter type 
class Gen<T> {

    // initialize object of type 'T' 
    T obj;

    // constructor with receive type 'T'
    Gen(T o) {
        this.obj = o;
    }

    // getter 
    public T getObj() {
        return obj;
    }

    // display type T
    public void showType() {
        System.out.println("Generic{" + "Type=" + obj.getClass().getName() + '}');
    }
}

public class GenDemo {

    public static void main(String args[]) {
        // create a link to 'Gen' class with type Integer 
        Gen<Integer> obj;

        // create Integer object and assign it to 'obj'
        obj = new Gen<Integer>(80);

        // вisplay type of Generic 
        obj.showType();

        // get object
        int v = obj.getObj();

        System.out.println("Variable v : " + v);
        System.out.println();

        // create a link to 'Gen' class with type 'String'
        Gen<String> obj1;

        // create 'String' object and assign it to 'obj'
        obj1 = new Gen<String>("Generic type String");

        // вisplay type of Generic 
        obj1.showType();

        // get object
        String str = obj1.getObj();

        System.out.println("Variable str : " + str);
    }
}
