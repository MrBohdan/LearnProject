package GenericDemo;

/**
 * A generic type can be restricted, by type of class or/and one to many
 * interface types (by using logical operator AND). Keyword 'extends' to set the
 * upper boundaries. Keyword 'super' to set the lover boundaries.
 *
 * @author Bohdan Skrypnyk
 */
// generic interface
interface MaxMin<T extends Comparable<T>> {

    T min();

    T max();
}

// implement generic interface 'MaxMin'
// an interface comparable is aimed to compare objects
class MyClass<T extends Comparable<T>> implements MaxMin {

    T[] vals; // massive of the objects of the type T

    public MyClass(T[] val) {
        this.vals = val;
    }

    // return min value of massive 'vals'
    // an interface comparable is aimed to compare objects
    @Override
    public Comparable min() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }
        return v;
    }

    // return min value of massive 'vals'
    // an interface comparable is aimed to compare objects
    @Override
    public Comparable max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }

}

public class GenInterfDemo {

    public static void main(String args[]) {
        Integer num[] = {2, 3, 5, 7, 9};
        Character ch[] = {'a', 't', 'e', 'g'};

        // create the objects of the type 'MyClass' for integer
        MyClass<Integer> obj1 = new MyClass<Integer>(num);
        MyClass<Character> obj2 = new MyClass<Character>(ch);

        System.out.println("Max integer : " + obj1.max());
        System.out.println("Min integer : " + obj1.min());

        System.out.println("Max character : " + obj2.max());
        System.out.println("Min character : " + obj2.min());
    }
}
