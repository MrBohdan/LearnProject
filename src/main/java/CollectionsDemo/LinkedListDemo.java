package CollectionsDemo;

import java.util.LinkedList;

/**
 * Class 'LinkedList' extends class 'AbstractSequentialList' and implements the
 * interfaces 'List', 'Queue', 'DeQueue'. It stores the elements as separate
 * linked objects/nodes with the data and link/pointer(to the next node).
 * Moreover, exist a doubly LinkedList, where each node linked with the previous
 * and next node. The 'LinkedList' extends 'Queue' and 'DeQueue', nodes cannot
 * be accessed directly.
 *
 * @author Bohdan Skrypnyk
 */
class Employee1 {

    // variables of the object 'Employee1'
    int id;
    String name;
    int age;
    double salary;

    // constructor
    public Employee1(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void show() {
        System.out.println("\n" + "ID : " + getId() + "\nName : " + getName() + "\nAge : " + getAge() + "\nSalary : " + getSalary());
    }
}

public class LinkedListDemo {

    public static void main(String args[]) {

        // create the objects of the type 'Employee1' 
        Employee1 empl1 = new Employee1(1, "James", 19, 55.1);
        Employee1 empl2 = new Employee1(2, "Jackson", 55, 33.3);
        Employee1 empl3 = new Employee1(3, "Ella", 30, 44.5);
        Employee1 empl4 = new Employee1(4, "Olivia", 35, 22.5);
        Employee1 empl5 = new Employee1(5, "Isabella", 25, 42.6);
        
        // initialize 'LinkedList' with the type 'Employee1'
        LinkedList<Employee1> ll = new LinkedList();

        // add the objects to 'LinkedList'
        ll.add(empl1);
        ll.add(empl2);
        ll.add(empl3);

        // add an object as the last node
        ll.addLast(empl4);

        // add an object as the first node
        ll.addFirst(empl5);

        System.out.println("\n" + "LinkedList before removing of the object");

        // display the objects from the 'LinkedList' 
        ll.forEach((emp) -> {
            emp.show();
        });

        // remove the objects from the 'LinkedList' 
        ll.remove(empl3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println("\n" + "LinkedList after removing of the object");

        // display the objects from the 'LinkedList' 
        ll.forEach((emp) -> {
            emp.show();
        });
    }
}
