package GenericDemo;

/**
 * Generic allows using any type of data for the object
 *
 * @author Bohdan Skrypnyk
 */
class TwoGen<T, E> {

    T obj1;// initialize object of type 'T' 
    E obj2;// initialize object of type 'E' 

    public TwoGen(T t, E e) {
        obj1 = t;
        obj2 = e;
    }

    //  getter for type 'T'
    public T getObj1() {
        return obj1;
    }

    // getter for type 'E'
    public E getObj2() {
        return obj2;
    }

    // display types of generic 
    public void showType() {
        System.out.println("Generic <T> {" + "Type=" + obj1.getClass().getName() + '}'
                + "\nGeneric <E> {" + "Type=" + obj2.getClass().getName() + '}' + "\n");
    }
}

public class SimpGen {

    public static void main(String args[]) {
        // create a link to 'Gen' class with type Integer  and String
        TwoGen<Integer, String> obj = new TwoGen<Integer, String>(15, " Generic with two parameterized types");

        // вisplay types of пeneric 
        obj.showType();

        // get objects
        obj.getObj1();
        obj.getObj2();

        System.out.println("T obj1 : " + obj.obj1 + " T obj1 : " + obj.obj2);
    }
}
