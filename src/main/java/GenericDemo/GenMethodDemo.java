package GenericDemo;

/**
 * A generic type can be restricted, by type of class or/and one to many
 * interface types (by using logical operator AND). Keyword 'extends' to set the
 * upper boundaries. Keyword 'super' to set the lover boundaries.
 *
 * The generic type of method must be initialized before initialization of the
 * returning type of the method
 *
 * @author Bohdan Skrypnyk
 */
public class GenMethodDemo {

    // check if the object in the massive 
    // type 'V' is bounded by type 'T', 
    // so they must be similar or 'V' must be subtype of 'T'
    // an interface comparable is aimed to compare objects
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) { // compare the object 'x' with each object from massive 
                return true; // if yes return false
            }
        }
        return false; // if not return false
    }

    public static void main(String args[]) {
        Integer num[] = {1, 2, 3, 4, 5, 6, 7};

        if (isIn(2, num)) {
            System.out.println("Number 2 is in the massive");
        }
        if (!isIn(10, num)) {
            System.out.println("Number 10 is not in the massive");
        }

        String str[] = {"one", "two", "three", "four", "five", "six", "seven"};

        if (isIn("three", str)) {
            System.out.println("Three is in the massive");
        }
        if (!isIn("eleven", str)) {
            System.out.println("Eleven is not in the massive");
        }
    }
}
