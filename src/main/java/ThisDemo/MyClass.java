package ThisDemo;

/**
 * One of the purpose of using keyword 'this' is to avoid duplications of code,
 * but performance drops.
 *
 * Keywords 'super' and 'this' cannot be used in one constructor
 *
 * @author Bohdan Skrypnyk
 */
public class MyClass {

    int a, b;

    // initialization of param 'a' and 'b'  
    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    MyClass(int i) {
        // in this conditions keyword 'this', a bit similar to keyword 'super'
        // bc it call 'MyClass(int i, int j)' constructor
        this(i, i);
    }

    // assign 0 to variables 'a' and 'b'
    MyClass() {
        // keyword 'this' call 'MyClass(int i)' constructor
        this(0);
    }

    public static void main(String args[]) {
        MyClass obj = new MyClass(10);

        System.out.println("obj : " + obj.a + " " + obj.b);

        MyClass obj1 = new MyClass();

        System.out.println("obj1 : " + obj1.a + " " + obj1.b);
    }
}
