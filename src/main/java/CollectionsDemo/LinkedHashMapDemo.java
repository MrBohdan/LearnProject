package CollectionsDemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Class 'LinkedHashMap' extends a 'HashMap' class, is used to store values in
 * the same order as they were added.
 *
 * @author Bohdan Skrypnyk
 */
public class LinkedHashMapDemo {

    public static void main(String args[]) {

        // The object type 'Employee3' used from the 'HashSetDemo'.
        // create the objects of the type 'Employee3' 
        Employee3 empl1 = new Employee3(2, "James", 19, 55.1);
        Employee3 empl2 = new Employee3(1, "Jackson", 55, 33.3);
        Employee3 empl3 = new Employee3(4, "Ella", 30, 44.5);
        Employee3 empl4 = new Employee3(3, "Olivia", 35, 22.5);
        Employee3 empl5 = new Employee3(5, "Isabella", 25, 42.6);

        // initialization of the 'LinkedHashMap' with the Key 'Integer' and type 'Employee3'
        LinkedHashMap<Integer, Employee3> lhm = new LinkedHashMap();

        // add the objects to the 'LinkedHashMap'
        lhm.put(empl1.getId(), empl1);
        lhm.put(empl2.getId(), empl2);
        lhm.put(empl3.getId(), empl3);
        lhm.put(empl4.getId(), empl4);
        lhm.put(empl5.getId(), empl5);

        // return records from the 'LinkedHashMap' as 'Set' with type 'Map.Entry<Integer, Employee3>'
        Set<Map.Entry<Integer, Employee3>> set = lhm.entrySet();

        System.out.println("(For-each loop) Display employee from LinkedHashMap'");

        // display 'Set'
        for (Map.Entry<Integer, Employee3> emp : set) {
            emp.getValue().show();
        }

        // initialization of the interface 'Iterator' with type 'Map.Entry<Integer, Employee3>'
        Iterable<Map.Entry<Integer, Employee3>> itr = lhm.entrySet();

        System.out.println("\n" + "(Iterable with 'forEach()' method) Display employee from LinkedHashMap'");

        itr.forEach((emp) -> {
            emp.getValue().show();
        });
    }
}
