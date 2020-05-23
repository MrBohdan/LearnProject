package CollectionsDemo;

import java.util.LinkedHashSet;

/**
 * Class 'LinkedHashSet' extends class 'HashSet', have the same methods, and
 * stores linked hash values in the same order as they were added. Display
 * values in the corresponding order.
 *
 * @author Bohdan Skrypnyk
 */
public class LinkedHashSetDemo {

    public static void main(String args[]) {

        // The object type 'Employee3' used from the 'HashSetDemo'.
        // create the objects of the type 'Employee3' 
        Employee3 empl1 = new Employee3(1, "James", 19, 55.1);
        Employee3 empl2 = new Employee3(2, "Jackson", 55, 33.3);
        Employee3 empl3 = new Employee3(3, "Ella", 30, 44.5);
        Employee3 empl4 = new Employee3(4, "Olivia", 35, 22.5);
        Employee3 empl5 = new Employee3(5, "Isabella", 25, 42.6);

        // initialize 'LinkedHashSet' with the type 'Employee3'
        LinkedHashSet<Employee3> lhs = new LinkedHashSet();

        // add values to 'LinkedHashSet'
        lhs.add(empl1);
        lhs.add(empl2);
        lhs.add(empl3);
        lhs.add(empl4);
        lhs.add(empl5);

        System.out.println("Display employees");

        // by using for each lopp,
        // get all employee
        for (Employee3 emp : lhs) {
            emp.show();
        }

        // remove an object from the 'HashSet'
        lhs.remove(empl4);

        System.out.println("\n" + "(lambda) Display employees");
        lhs.forEach((emp) -> {
            emp.show();
        });
    }
}
