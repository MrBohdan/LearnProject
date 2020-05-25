package CollectionsDemo;

import java.util.ArrayDeque;

/**
 * Class 'ArrayQueue' extends class 'AbstractCollection'and implements an
 * interface 'Deque', is used to create not limited dynamic massive.
 *
 * @author Bohdan Skrypnyk
 */
public class ArrayDequeDemo {

    public static void main(String args[]) {

        // The object type 'Employee3' used from the class 'HashSetDemo'.
        // create the objects of the type 'Employee3' 
        Employee3 empl1 = new Employee3(1, "James", 19, 55.1);
        Employee3 empl2 = new Employee3(2, "Jackson", 55, 33.3);
        Employee3 empl3 = new Employee3(3, "Ella", 30, 44.5);
        Employee3 empl4 = new Employee3(4, "Olivia", 35, 22.5);
        Employee3 empl5 = new Employee3(5, "Isabella", 25, 42.6);
        Employee3 empl6 = new Employee3(5, "Isabella", 25, 42.6);

        // initialization of the 'ArrayDeque' with the type 'Employee3'
        ArrayDeque<Employee3> arrdq = new ArrayDeque();

        arrdq.push(empl1);
        arrdq.push(empl2);
        arrdq.push(empl3);
        arrdq.push(empl4);
        arrdq.push(empl5);
        arrdq.push(empl6);

        // a method peek() get, but not remove the first element of the stack
        while (arrdq.peek() != null) {
            // a method pop() remove and return the first element of the stack
            arrdq.pop().show();
        }
    }
}
