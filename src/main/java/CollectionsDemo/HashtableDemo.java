package CollectionsDemo;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Class 'Hashtable' implements an interface 'Map' and working in the same way
 * as HashMap, but synchronized.
 *
 * @author Bohdan Skrypnyk
 */
public class HashtableDemo {

    private static Hashtable<String, Cities2> hashtabe;
    private static Cities2 cities2;

    // a method to push objects to a 'Hashtable'
    private static void makePush(Hashtable<String, Cities2> hashtabe, Cities2 cities2) {

        hashtabe.put(cities2.getState(), cities2);
    }

    public static void main(String args[]) {
        // initialization of a 'Hashtable' class
        hashtabe = new Hashtable();

        // The object type 'Cities2' used from the 'AlgorithmsDemo'.
        // create the objects of the type 'Cities2' 
        makePush(hashtabe, new Cities2("Eufaula", "Alabama", 54.44));
        makePush(hashtabe, new Cities2("Homer", "Alaska", 250.60));
        makePush(hashtabe, new Cities2("New York", "City in New York State", 119.44));
        makePush(hashtabe, new Cities2("Scottsdale", "Arizona", 25.44));
        makePush(hashtabe, new Cities2("Forrest City", "Arkansas", 11.4));
        makePush(hashtabe, new Cities2("Bakersfield", "California", 7.5));

        // return records from the 'Hashtable' as 'Set'
        // with type 'Map.Entry<String, Cities2>'
        Set<Map.Entry<String, Cities2>> set = hashtabe.entrySet();

        // display values from the 'Set' 
        for (Map.Entry<String, Cities2> st : set) {

            System.out.println("Key : " + st.getKey() + " Value : ");
            st.getValue().show();
        }

        // get value by key
        cities2 = hashtabe.get("Arizona");

        // change value
        cities2 = new Cities2(cities2.getCityName(), cities2.getState(), cities2.getDebt() - 20.1D);

        // push changed value to a 'Hashtable' 
        makePush(hashtabe, cities2);

        // display new value
        System.out.println();
        hashtabe.get("Arizona").show();
    }
}
