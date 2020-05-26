package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * There is no much difference between the 'Iterator' and the 'for loop',
 * 'for-each loop'. The 'For-each loop' is more readable. But the 'For-each
 * loop' does not allow to modify (add/remove) the array, in the iteration
 * process. While an interface 'Iterator' allows. So, if no need to change
 * collection, then the 'for each' is much convenient.
 *
 * @author Bohdan Skrypnyk
 */
public class IteratorDemo {

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

        System.out.println("> Iterator : ");

        // initialization of the interface 'Iterator'
        Iterator<Employee3> itr = arr.iterator();

        System.out.println("\n" + "> The 'while loop' to remove the empl2 & empl4 : ");

        // the 'while loop' to remove the values
        while (itr.hasNext()) {
            Employee3 emp = itr.next();
            if (emp.equals(empl2) || emp.equals(empl4)) {
                itr.remove();
                System.out.println("\n" + "> Deleted value ID  : " + emp.getId());
            }
        }

        itr = arr.iterator();

        System.out.println("\n" + "> The 'while loop' to display array : ");
        while (itr.hasNext()) {
            itr.next().show();
        }

        System.out.println("\n" + "> The 'for loop' : ");

        // The 'for loop' can just display array,
        // and does not allow to modify (add/remove)
        // the array, in the iteration process.
        for (Employee3 emp : arr) {
            emp.show();
        }

        System.out.println("\n" + "> The 'for loop' using an interface 'Iterator' directly : ");

        // Using an interface 'Iterator' directly in the 'for loop',
        // give access to a 'remove()' method.
        for (Iterator<Employee3> iter = arr.iterator(); iter.hasNext();) {
            if (iter.next().equals(empl3)) {
                iter.remove();
                System.out.println("\n" + "> Deleted value ID : " + empl3.getId());
            }

        }
        for (Iterator<Employee3> iter = arr.iterator(); iter.hasNext();) {
            if (iter.hasNext()) {
                iter.next().show();
            }
        }
    }
}
