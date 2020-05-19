package StringProcessing;

/**
 * To check if the string is more, less, or equal to the next string. If called
 * strings have the same length with the comparable string, the method
 * compareTo() return number 1. If they equal then return 0 and if not -1.
 *
 * @author Bohdan Skrypnyk
 */
public class SortStrings {

    static String arr[] = {"Renewable", "energy", "is", "energy",
        "that", "is", "collected", "from", "renewable", "resources"};

    // bubble sort of the strings 
    public static void main(String args[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int a = i + 1; a < arr.length; a++) {

                // compare one strings with each other
                // if caller string longer than next 
                if (arr[a].compareTo(arr[i]) < 0) {

                    // add a smaller string to temp.
                    // bc 'arr[a]' more than 'arr[i]'
                    // and need to swap them 
                    String temp = arr[i];

                    // replace/swap 'arr[a]' to position of 'arr[i]'.
                    // A bigger string that was on a lower position
                    // will be placed on a higher position where we're
                    // a smaller string.
                    arr[i] = arr[a];

                    // A smaller string that was on a higher position
                    // will be placed on a lower position where we're
                    // a bigger string.
                    arr[a] = temp;
                }

            }
            System.out.println(arr[i]);
        }
    }
}
