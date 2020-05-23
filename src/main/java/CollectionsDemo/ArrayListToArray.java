package CollectionsDemo;

import java.util.ArrayList;

/**
 * Class 'ArrayList' extends class 'AbstractList' and implements interface
 * 'List', is used for dynamic massive.
 *
 * A method 'toArray()' is used to convert 'ArrayList' to massive.
 *
 * @author Bohdan Skrypnyk
 */
public class ArrayListToArray {

    public static void main(String arhs[]) {

        // initialize 'ArrayList' with the type 'Integer'
        ArrayList<Integer> arr = new ArrayList();

        // add values to 'ArrayList'
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        // initialize massive with the type 'Integer'
        Integer num[] = new Integer[arr.size()];

        // create massive from ArrayList
        num = arr.toArray(num);

        int sum = 0;

        // count sum of the massive
        for (Integer n : num) {
            sum += n;
        }

        System.out.println("Sum " + sum);
    }
}
