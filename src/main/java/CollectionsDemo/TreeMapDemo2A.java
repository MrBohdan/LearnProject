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
class CompareLastNames implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        int a, j;

        // find the index on which beginning surname
        // and sort in ascending order.
        a = str1.lastIndexOf(' ');
        j = str2.lastIndexOf(' ');
        return str1.substring(a).compareToIgnoreCase(str2.substring(j));
    }
}

class CompareThenByFirstName implements Comparator<String> {

    // compare names if surnames are same
    // and sort in ascending order.
    @Override
    public int compare(String str1, String str2) {
        return str1.compareToIgnoreCase(str2);
    }
}

public class TreeMapDemo2A {

    public static void main(String args[]) {

        // A method 'thenComparing()', is used to compare surnames
        // and then names if surnames are same.
        CompareLastNames cln = new CompareLastNames();
        Comparator<String> comp = cln.thenComparing(new CompareThenByFirstName());

        // initialization of the 'TreeMap' with the types '<String, Double>'
        TreeMap<String, Double> tm = new TreeMap(comp);

        // add the objects to the 'TreeMap'
        tm.put("Isaac Newton", 11224.83);
        tm.put("Stephen Hawking", 12344.12);
        tm.put("Michael Lovelace", 23123.12);
        tm.put("Michael Faraday", 34553.54);
        tm.put("Ada Lovelace", 7895.12);
        tm.put("Tim Berners-Lee", 6453.23);

        // return records from the 'TreeMap' as 'Set'
        // with type 'Map.Entry<String, Double>'
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // display values from the 'Set'
        for (Map.Entry<String, Double> c : set) {
            System.out.print(c.getKey() + " : ");
            System.out.println(c.getValue());
        }

        // get value by key
        double bl = tm.get("Michael Faraday");

        // change value
        tm.put("Michael Faraday", bl - 20000);

        // display new value
        System.out.println("\n" + "New balance of " + tm.ceilingKey("Michael Faraday") + " : " + tm.get("Michael Faraday") + "\n");

        // another example with lambda expression 
        Comparator<String> comp1 = ((surname1, surname2) -> surname1.compareToIgnoreCase(surname2));
        comp1.thenComparing((name1, name2) -> name1.compareToIgnoreCase(name2));

        System.out.println("Same with the lambda expression" + "\n");

        // initialization of the 'TreeMap' with the types '<String, Double>'
        TreeMap<String, Double> tm1 = new TreeMap(comp1);

        // add the objects to the 'TreeMap'
        tm1.put("Anne Stuart", 5234.23);
        tm1.put("Alexandrina Victoria", 6532.54);
        tm1.put("Lucian Freud", 1235.72);
        tm1.put("Michael Freud", 4534.43);
        tm1.put("Albert Edward", 6587.23);
        tm1.put("Francis Bacon", 1234.74);

        // return records from the 'TreeMap' as 'Set'
        // with type 'Map.Entry<String, Double>'
        Set<Map.Entry<String, Double>> set1 = tm1.entrySet();

        // display values from the 'Set'
        for (Map.Entry<String, Double> c : set1) {
            System.out.print(c.getKey() + " : ");
            System.out.println(c.getValue());
        }
    }
}
