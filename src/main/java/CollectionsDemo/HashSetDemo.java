package CollectionsDemo;

import java.util.HashSet;

/**
 * Class 'HashSet' extends class 'AbstractSet' and implement an interface 'Set',
 * is used to create collections. it stores the values in the hashtable, do not
 * allow duplicate/NULL values, and not sorting values. HashCode used as the
 * index in hashtable.
 *
 * @author Bohdan Skrypnyk
 */
class Employee3 {

    // variables of the object 'Employee3'
    int id;
    String name;
    int age;
    double salary;

    // constructor
    public Employee3(int id, String name, int age, double salary) {
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

public class HashSetDemo {

    public static void main(String args[]) {

        // create the objects of the type 'Employee3' 
        Employee3 empl1 = new Employee3(1, "James", 19, 55.1);
        Employee3 empl2 = new Employee3(2, "Jackson", 55, 33.3);
        Employee3 empl3 = new Employee3(3, "Ella", 30, 44.5);
        Employee3 empl4 = new Employee3(4, "Olivia", 35, 22.5);
        Employee3 empl5 = new Employee3(5, "Isabella", 25, 42.6);

        // initialize 'HashSet' with the type 'Employee3'
        HashSet<Employee3> st = new HashSet();

        // add the objects to the 'HashSet'
        st.add(empl1);
        st.add(empl2);
        st.add(empl3);
        st.add(empl4);
        st.add(empl5);

        System.out.println("Display employees");

        // by using for each lopp,
        // get all employee
        for (Employee3 emp : st) {
            emp.show();
        }

        // remove an object from the 'HashSet'
        st.remove(empl4);

        System.out.println("\n" + "(lambda) Display employees");
        st.forEach((emp) -> {
            emp.show();
        });
    }
}
