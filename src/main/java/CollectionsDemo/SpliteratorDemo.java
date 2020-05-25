package CollectionsDemo;

import java.util.ArrayList;
import java.util.Spliterator;

/**
 * An interface 'Spliterator' has more functional opportunities than 'Iterator'
 * and 'ListIterator'. The 'Spliterator' supports parallel iteration.
 *
 * Both methods 'tryAdvance()' and 'forEachRemaining()' combine in one call the
 * methods 'next()' and 'hasNext()' form the 'Iterator' interface.
 *
 * @author Bohdan Skrypnyk
 */
public class SpliteratorDemo {

    public static void main(String args[]) {

        // The object type 'Employee3' used from the 'HashSetDemo'.
        // create the objects of the type 'Employee3' 
        Employee3 empl1 = new Employee3(1, "James", 19, 55.1);
        Employee3 empl2 = new Employee3(2, "Jackson", 55, 33.3);
        Employee3 empl3 = new Employee3(3, "Ella", 30, 44.5);
        Employee3 empl4 = new Employee3(4, "Olivia", 35, 22.5);
        Employee3 empl5 = new Employee3(5, "Isabella", 25, 42.6);

        // initialization of the 'ArrayList' with the type 'Employee3'
        ArrayList<Employee3> arr = new ArrayList();

        // add the objects to the 'ArrayList'
        arr.add(empl1);
        arr.add(empl2);
        arr.add(empl3);
        arr.add(empl4);
        arr.add(empl5);

        System.out.println("'tryAdvance()' ArrayList values : ");
        Spliterator<Employee3> split = arr.spliterator();

        // a 'tryAdvance()' method return 'true' 
        // while elements in collection exist
        while (split.tryAdvance((emp) -> emp.show()));

        split = arr.spliterator();
        System.out.println("'forEachRemaining()' ArrayList values : ");

        // call each remaining element 
        split.forEachRemaining((emp) -> emp.show());
    }
}
