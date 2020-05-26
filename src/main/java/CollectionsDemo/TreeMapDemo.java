package CollectionsDemo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Class 'ThreeMap', is used to store values by keys in the sorted tree
 * structure. This tree mapping guarantees that all values will be sorted, as
 * key increases.
 *
 * @author Bohdan Skrypnyk
 */
public class TreeMapDemo {

    public static void main(String args[]) {

        // The object type 'Employee3' used from the 'HashSetDemo'.
        // create the objects of the type 'Employee3' 
        Employee3 empl1 = new Employee3(1, "James", 24, 123.24);
        Employee3 empl2 = new Employee3(2, "Jackson", 36, 345.12);
        Employee3 empl3 = new Employee3(3, "Ella", 27, 814.52);
        Employee3 empl4 = new Employee3(4, "Olivia", 18, 742.37);
        Employee3 empl5 = new Employee3(5, "Isabella", 50, 385.32);

        // initialization of the 'TreeMap' with the Key 'Integer' and type 'Employee3'
        TreeMap<Integer, Employee3> tm = new TreeMap();

        // add the objects to the 'TreeMap'
        tm.put(empl1.getId(), empl1);
        tm.put(empl2.getId(), empl2);
        tm.put(empl3.getId(), empl3);
        tm.put(empl4.getId(), empl4);
        tm.put(empl5.getId(), empl5);

        // return records from the 'TreeMap' as 'Set' with type 'Map.Entry<Integer, Employee3>'
        Set<Map.Entry<Integer, Employee3>> st = tm.entrySet();

        // display 'Set'
        for (Map.Entry<Integer, Employee3> emp : st) {
            emp.getValue().show();
        }
    }
}
