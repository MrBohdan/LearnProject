package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Class 'HashMap' is used to store values by keys in hash-table. Do not allow
 * duplicates.
 *
 * @author Bohdan Skrypnyk
 */
public class HashMapDemo {

    public static void main(String args[]) {

        // The object type 'Employee3' used from the 'HashSetDemo'.
        // create the objects of the type 'Employee3' 
        Employee3 empl1 = new Employee3(1, "James", 24, 123.24);
        Employee3 empl2 = new Employee3(2, "Jackson", 36, 345.12);
        Employee3 empl3 = new Employee3(3, "Ella", 27, 814.52);
        Employee3 empl4 = new Employee3(4, "Olivia", 18, 742.37);
        Employee3 empl5 = new Employee3(5, "Isabella", 50, 385.32);

        // initialization of the 'HashMap' with the Key 'Integer' and type 'Employee3'
        HashMap<Integer, Employee3> hm = new HashMap();

        // add the objects to the 'HashMap'
        hm.put(empl1.getId(), empl1);
        hm.put(empl2.getId(), empl2);
        hm.put(empl3.getId(), empl3);
        hm.put(empl4.getId(), empl4);
        hm.put(empl5.getId(), empl5);

        // return records from the 'HashMap' as 'Set' with type 'Map.Entry<Integer, Employee3>'
        Set<Map.Entry<Integer, Employee3>> set = hm.entrySet();

        // display 'Set'
        for (Map.Entry<Integer, Employee3> m : set) {
            System.out.print("Key : " + m.getKey());
            m.getValue().show();
        }
    }
}
