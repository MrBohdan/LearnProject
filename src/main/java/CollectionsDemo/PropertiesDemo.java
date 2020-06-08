package CollectionsDemo;

import java.util.Properties;
import java.util.Set;

/**
 * Class 'Properties' extends 'Hashtable' class is used to store the list where
 * key and value are strings.
 *
 * @author Bohdan Skrypnyk
 */
public class PropertiesDemo {

    private static Properties properties;

    // a method to push objects to a 'Properties'
    private static void makePush(Properties properties, String cityName, String state) {
        properties.put(cityName, state);
    }

    public static void main(String args[]) {
        // initialization of a 'Properties' class
        properties = new Properties();

        // add values to 'Properties'
        makePush(properties, "Eufaula", "Alabama");
        makePush(properties, "Homer", "Alaska");
        makePush(properties, "New York", "City in New York State");
        makePush(properties, "Scottsdale", "Arizona");
        makePush(properties, "Forrest City", "Arkansas");
        makePush(properties, "Bakersfield", "California");

        // return records from the 'Properties' as 'Set'
        // with type 'Object'
        Set<?> set = properties.keySet();

        // display values from the 'Set' 
        for (Object st : set) {
            System.out.println(st + " - " + properties.getProperty((String) st));
        }

        // get property by a key and return a message if not found
        String str = properties.getProperty("Scottsdale", "not found");
        System.out.println(str);

        String str1 = properties.getProperty("Scot", "not found");
        System.out.println(str1);
    }
}
