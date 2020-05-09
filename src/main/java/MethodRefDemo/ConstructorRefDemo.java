package MethodRefDemo;

/**
 * Method reference operator '::' working similar to Lambda expressions. They
 * both just call a method\constructor\ an instance method.
 *
 * @author Bohdan Skrypnyk
 */
// functional interface which retrun reference on the 'Employee' class
interface MyIntEmployee {

    Employee func(String name, int age, double salary);
}

class Employee {

    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // getter for the parameter 'name'
    public String getName() {
        return name;
    }

    // getter for the parameter 'age'
    public int getAge() {
        return age;
    }

    // getter for the parameter 'salary'
    public double getSalary() {
        return salary;
    }
}

public class ConstructorRefDemo {

    public static void main(String args[]) {

        // create a reference on the constructor 'Employee' 
        // method 'func' receive parameters from the functional interface 'MyIntEmployee',
        // bc of this operator 'new' refers to the constructor
        // with parameters from the 'Employee' class
        MyIntEmployee myemp = Employee::new;

        // create an instance of the 'Employee' class,
        // by using the reference on its constructor 
        Employee mc = myemp.func("Tommy", 12, 200.5);

        System.out.println("Name : " + mc.getName() + " Age : " + mc.getAge() + " Salary : " + mc.getSalary());

        // same with a lambda expression
        MyIntEmployee myemp1 = (name, age, salary) -> new Employee(name, age, salary);
        Employee mc1 = myemp1.func("Tommy", 12, 200.5);

        System.out.println("Name : " + mc1.getName() + " Age : " + mc1.getAge() + " Salary : " + mc1.getSalary());
    }
}
