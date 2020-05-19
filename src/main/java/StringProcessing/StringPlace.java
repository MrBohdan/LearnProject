package StringProcessing;

/**
 * A method 'substring()' is used to extract sub-string from the string.
 *
 * @author Bohdan Skrypnyk
 */
public class StringPlace {

    public static void main(String args[]) {
        String str = "This is a test. This is, too";
        String search = "is";
        String substr = "was";
        String result = "";
        int i;
        do { // change all matched strings
            System.out.println(str);

            // get the index of the searched string
            // if the search string was not found, return -1
            i = str.indexOf(search);

            if (i != -1) {
                // add to result, a substring before the search string  
                result = str.substring(0, i);

                // add defined substring to result 
                result += substr;

                // add to result a substring which is starting on the searched string
                // and going to the end of the string 
                result += str.substring(i + search.length());

                // rewrite original string
                str = result;
            }

        } while (i != -1); // if there is no search string will end loop 
    }
}
