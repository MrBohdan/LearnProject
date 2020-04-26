package ArityDemo;

/**
 *
 * @author Bohdan Skrypnyk
 *
 * Variable arity methods / Variable Arguments (Varargs)
 */
public class ArityMethods {

    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Содержимое / Contain :");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest("Один параметр переменной длины / One variable arity methods: ", 10);
        vaTest("Два параметра переменной длины / Two variable arity methods: ", 10, 20);
        vaTest("Три параметра переменной длины / Three variable arity methods: ", 10, 15, 20);
        vaTest("Четыре параметра переменной длины / Four variable arity methods: ", 10, 15, 20, 14);
    }
}
