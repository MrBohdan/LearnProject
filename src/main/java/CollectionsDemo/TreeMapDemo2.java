package CollectionsDemo;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * An interface 'Comparator', is used to manipulate the order in collections.
 *
 * The 'compareTo()' method, is used to compare strings.
 *
 * @author Bohdan Skrypnyk
 */
class CompareSurnames implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        int a, j, k;

        // find the index on which beginning surname
        // and sort in ascending order.
        a = str1.lastIndexOf(' ');
        j = str2.lastIndexOf(' ');
        k = str1.substring(a).compareTo(str2.substring(j));

        if (k == 0) { // if the surname is same
            return str1.compareTo(str2); // check name and surname
        } else {
            return k;
        }
    }
}

public class TreeMapDemo2 {

    public static void main(String args[]) {

        // initialization of the 'TreeMap' with the types '<String, Double>'
        TreeMap<String, Double> tm = new TreeMap(new CompareSurnames());

        // add the objects to the 'TreeMap'
        tm.put("Isaac Newton", 11224.83);
        tm.put("Stephen Hawking", 12344.12);
        tm.put("Michael Faraday", 34553.54);
        tm.put("Ada Lovelace", 7895.12);
        tm.put("Tim Berners-Lee", 6453.23);

        // return records from the 'TreeMap' as 'Set'
        // with type 'Map.Entry<String, Double>'
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // display values from the 'Set'
        for (Map.Entry<String, Double> dt : set) {
            System.out.print(dt.getKey() + " : ");
            System.out.println(dt.getValue());
        }

        // get value by key
        double bl = tm.get("Isaac Newton");

        // change value
        tm.put("Isaac Newton", bl - 1000);
        
        // display new value
        System.out.println("\n" + "New balance of " + tm.ceilingKey("Isaac Newton") + " : " + tm.get("Isaac Newton"));
    }
}
