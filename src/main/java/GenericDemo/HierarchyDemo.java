package GenericDemo;

/**
 * A generic type can be restricted, by type of class or/and one to many
 * interface types (by using logical operator AND). Keyword 'extends' to set the
 * upper boundaries. Keyword 'super' to set the lover boundaries.
 *
 * Operator 'instanceof' used to check of the object is the instance of class
 *
 * @author Bohdan Skrypnyk
 */
class Gen2<T> {

    T obj;// object of the type 'T'

    // the constructor receive an object of the type 'T' 
    public Gen2(T obj) {
        this.obj = obj;
    }

    // getter for 'obj'
    public T getObj() {
        return obj;
    }

}

// sublcass of 'Gen2'
class Gen3<T> extends Gen2<T> {

    public Gen3(T obj) {
        super(obj);
    }
}

public class HierarchyDemo {

    public static void main(String args[]) {
        // create an object of the type 'Gen3' for integers
        Gen2<Integer> obj1 = new Gen2<Integer>(12);

        // create an object of the type 'Gen3' for integers
        Gen3<Integer> obj2 = new Gen3<Integer>(8);

        // create an object of the type 'Gen3' for strings
        Gen3<String> obj3 = new Gen3<String>("String obj");

        // check of the 'obj1' is the instance of 'Gen3' class 
        if (obj1 instanceof Gen3<?>) {
            System.out.println("An obj1 is the instance of the class 'Gen3'\n");
        } else {
            System.out.println("An obj1 is not the instance of the class 'Gen3'\n");
        }

        // check of the 'obj2' is the instance of 'Gen2' class 
        if (obj2 instanceof Gen2<?>) {
            System.out.println("An obj2 is the instance of the class 'Gen2'\n");
        } else {
            System.out.println("An obj2 is not the instance of the class 'Gen2'\n");
        }

        // check of the 'obj3' is the instance of 'Gen3' class 
        if (obj3 instanceof Gen3<?>) {
            System.out.println("An obj3 is the instance of the class 'Gen3'\n");
        } else {
            System.out.println("An obj3 is not the instance of the class 'Gen3'\n");
        }

        // check of the 'obj3' is the instance of 'Gen2' class 
        if (obj3 instanceof Gen2<?>) {
            System.out.println("An obj3 is the instance of the class 'Gen2'\n");
        } else {
            System.out.println("An obj3 is not the instance of the class 'Gen2'\n");
        }
    }
}
