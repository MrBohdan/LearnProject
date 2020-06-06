package CollectionsDemo;

import java.util.*;

/**
 * Class 'Stack' implements a standard stack with the rule "Last entered - the
 * first processed". But better to use the 'ArrayDeque' that implements 'Queue,
 * Deque, and Stack'.
 *
 * @author Bohdan Skrypnyk
 */
public class StackDemo {

    private static void showpush(Stack<Cities2> stc, Cities2 city) {
        // to push an object to the top of the stack 
        stc.push(city);

        System.out.print("push : ");

        // to display the 'Cities2' object, that was pushed to the stack
        city.show();

        System.out.println("Stack : ");

        // to display all objects in the stack
        stc.forEach((a) -> a.show());
    }

    private static void showpop(Stack<Cities2> stc) {

        System.out.println("pop -> ");

        // to get an object of the type 'Cities2' 
        // from the top of the stack and remove from the stack
        Cities2 citi = stc.pop();

        // to display an object of the type 'Cities2'
        citi.show();

        System.out.println("Stack : ");

        // to display all objects in the stack
        stc.forEach((a) -> a.show());

    }

    public static void main(String args[]) {

        // initialization of a 'Stack' class
        Stack<Cities2> cityStack = new Stack();

        System.out.println("Stack : " + cityStack);

        // The object type 'Cities2' used from the 'AlgorithmsDemo'.
        // create the objects of the type 'Cities2' 
        showpush(cityStack, new Cities2("Eufaula", "Alabama", 54.44));
        showpush(cityStack, new Cities2("Homer", "Alaska", 250.60));
        showpush(cityStack, new Cities2("New York", "City in New York State", 119.44));
        showpush(cityStack, new Cities2("Scottsdale", "Arizona", 25.44));
        showpush(cityStack, new Cities2("Forrest City", "Arkansas", 11.4));
        showpush(cityStack, new Cities2("Bakersfield", "California", 7.5));

        System.out.println(">showpop()");

        // will display and remove objects from the stack
        for (int i = cityStack.size(); i >= 0; i--) {
            try {
                showpop(cityStack);
            } catch (EmptyStackException ex) {
                System.out.println("Stack is empty");
            }
        }
    }
}
