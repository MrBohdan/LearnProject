package CollectionsDemo;

import java.util.Optional;

/**
 * Class 'Optional' contains methods that allow checking, if an object is empty
 * or not and to define default value of an object.
 *
 * Classes 'OptionalDouble, OptionalLong and OptionalInt' working in the same
 * way, but just for defined data types.
 *
 * @author Bohdan Skrypnyk
 */
public class OptionalDemo {

    private static Optional<Cities2> noVal;
    private static Optional<Cities2> hasVal;

    public static void main(String args[]) {
        // initialization of an 'Optional' class with the type 'Cities2',
        // as empty 
        noVal = Optional.empty();
        // with value
        hasVal = Optional.of(new Cities2("New York", "City in New York State", 119.44));

        if (noVal.isPresent()) {// check if 'noVal' is not null
            System.out.println("Cannot be displayed");
        } else {
            System.out.println("Object 'noVal' is empty");
        }

        if (hasVal.isPresent()) {// check if 'hasVal' is not null
            System.out.print("An object 'Cities2' : ");

            // get and display the value 
            hasVal.get().show();
        }

        // setup default value 
        Cities2 cities2 = noVal.orElse(new Cities2("The city", "The State", 00.0));
        cities2.show();

    }
}
