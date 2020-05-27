package CollectionsDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * In a class Array defined methods that make array closer to the collections.
 *
 * @author Bohdan Skrypnyk
 */
class SortByName implements Comparator< Cities1> {

    // used to sort by city names in ascending order
    @Override
    public int compare(Cities1 ct1, Cities1 ct2) {
        return ct1.getCityName().compareTo(ct2.getCityName());
    }
}

public class ArrayDemo {

    public static void main(String args[]) {

        // The object type 'Cities1' used from the 'ComparatorDemo2'.
        // create the objects of the type 'Cities1' 
        Cities1 ct1 = new Cities1("Eufaula", "Alabama", 54.44);
        Cities1 ct2 = new Cities1("Homer", "Alaska", 250.60);
        Cities1 ct3 = new Cities1("New York", "City in New York State", 119.44);
        Cities1 ct4 = new Cities1("Scottsdale", "Arizona", 25.44);
        Cities1 ct5 = new Cities1("Forrest City", "Arkansas", 11.4);
        Cities1 ct6 = new Cities1("Bakersfield", "California", 7.5);

        Cities1 arr[] = {ct1, ct2, ct3, ct4, ct5, ct6};

        System.out.println("\n" + "Array");

        // to display an array before changes
        for (int i = 0; i < arr.length; i++) {
            arr[i].show();
        }

        System.out.println("\n" + "Sorted array by city names in ascending order");

        // to sort an array by city names in ascending order
        Arrays.sort(arr, new SortByName());

        // to display an array after sorting
        for (Cities1 ct : arr) {
            ct.show();
        }

        // to sort an array by names of the States in decreasing order
        Arrays.sort(arr, (Cities1 ct7, Cities1 ct8) -> ct8.getState().compareTo(ct7.getState()));

        System.out.println("\n" + "Sorted array by names of the States in decreasing order");

        // to display an array after sorting
        for (Cities1 ct : arr) {
            ct.show();
        }

        System.out.println("\n" + "Array filled by one object");

        Arrays.fill(arr, new Cities1("Bakersfield", "California", 7.5));

        // to display an array after filling
        for (Cities1 ct : arr) {
            ct.show();
        }
    }
}
