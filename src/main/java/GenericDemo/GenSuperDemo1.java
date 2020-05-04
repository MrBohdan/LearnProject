package GenericDemo;

/**
 * A generic type can be restricted, by type of class or/and one to many
 * interface types (by using logical operator AND). Keyword 'extends' to set the
 * upper boundaries. Keyword 'super' to set the lover boundaries.
 *
 * @author Bohdan Skrypnyk
 */
// non generic superclass
class NonGen {

    int num;

    public NonGen(int num) {
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
// the class 'Gen1' is the generic subclass

class Gen1<T> extends NonGen {

    T obj;// object of the type 'T'

    // the class 'Gen1' receive generic object and int
    public Gen1(T obj, int num) {
        super(num);
        this.obj = obj;
    }

    // getter for 'obj'
    public T getObj() {
        return obj;
    }
}

public class GenSuperDemo1 {

    public static void main(String args[]) {

        // create an object of the type 'Gen1' for strings
        Gen1<String> gener2 = new Gen1<String>("'new line'", 44);

        System.out.println("String : " + gener2.obj);
        System.out.println("int : " + gener2.num);
    }
}
