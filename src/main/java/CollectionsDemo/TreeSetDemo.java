package CollectionsDemo;

import java.util.TreeSet;

/**
 * Class 'TreeSet' extends class 'AbstractSet' and implements an interface
 * 'NavigableSet', storing values in the Tree structure in sorted increasing
 * order. Best for storing huge amounts of data, because of the fast execution
 * of the sorted values, do not allow duplicate. For default sorting, values
 * must be comparable.
 *
 * @author Bohdan Skrypnyk
 */
class Employee4 implements Comparable<Employee4> {

    // variables of the object 'Employee3'
    int id;
    String name;
    int age;
    double salary;

    // constructor
    public Employee4(int id, String name, int age, double salary) {
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

    // used to sort employee by names 
    @Override
    public int compareTo(Employee4 emp) {
        return this.name.compareTo(emp.name);
    }
}

public class TreeSetDemo {

    public static void main(String args[]) {

        // create the objects of the type 'Employee4' 
        Employee4 empl6 = new Employee4(7, "Isabella", 25, 42.6);

        // initialize 'TreeSet' with the type 'Employee4'
        TreeSet<Employee4> ts = new TreeSet();

        // add values to 'TreeSet'
        ts.add(new Employee4(1, "James", 19, 55.1));
        ts.add(new Employee4(2, "James", 20, 66.1));
        ts.add(new Employee4(3, "James", 19, 55.1));
        ts.add(new Employee4(4, "Ella", 30, 44.5));
        ts.add(new Employee4(5, "Olivia", 35, 22.5));
        ts.add(new Employee4(6, "Isabella", 25, 42.6));
        ts.add(empl6);

        System.out.println("Display employees");
        
        // by using for each lopp, 
        // get all employee
        for (Employee4 emp : ts) {
            emp.show();
        }

        // remove an object from the 'HashSet'
        ts.remove(empl6);

        System.out.println("\n" + "(lambda) Display employees");
        ts.forEach((emp) -> {
            emp.show();
        });
    }
}
