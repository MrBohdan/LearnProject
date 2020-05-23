package CollectionsDemo;

import java.util.ArrayList;

/**
 * Class 'ArrayList' extends class 'AbstractList' and implements interface
 * 'List', is used for dynamic massive.
 *
 * @author Bohdan Skrypnyk
 */
class Employee {

    // variables of the object 'Employee'
    String name;
    int age;
    double salary;

    // constructor
    public Employee(String name, int age, double salary) {
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

    public void show() {
        System.out.println("\nName : " + getName() + "\nAge : " + getAge() + "\nSalary : " + getSalary());
    }
}

public class ArrayListDemo {

    public static void main(String args[]) {

        // initialize the objects of the type 'Employee'
        Employee empl1 = new Employee("Bob", 22, 22.5);
        Employee empl2 = new Employee("Stiven", 44, 23.1);
        Employee empl3 = new Employee("Daniel", 19, 26.9);

        // initialize an 'ArrayList' with the type 'Employee'
        ArrayList<Employee> arr = new ArrayList(3);

        // add employees to ArrayList
        arr.add(empl1);
        arr.add(empl2);
        arr.add(empl3);

        // to display the size of the 'ArrayList'
        System.out.println("Quantity of employee : " + arr.size());

        // by using for each lopp,
        // get all employee
        for (Employee emp : arr) {
            emp.show();
        }

        // remove the object from an 'ArrayList'
        arr.remove(empl2);

        System.out.println("\nList of the employee after removing");
        for (Employee emp : arr) {
            emp.show();
        }

        System.out.println("\n(Lambda) List of the employee after removing");
        // forEach with the block lambda expression
        arr.forEach((emp)
                -> {
            emp.show();
        });
    }
}
