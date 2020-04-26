package ArityDemo;

/**
 *
 * @author Bohdan Skrypnyk
 *
 * Variable arity methods / Variable Arguments (Varargs)
 */
public class ArityMethodsWithOverloadingMethod {
    
    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean... v) Количество аргументов/ Amount of elements :" + v.length + "  Содержимое / Contain : ");
        for (boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(int... v) {
        System.out.print("vaTest(int... v) Количество аргументов/ Amount of elements :" + v.length + "  Содержимое / Contain : ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest(String msg, int... v) "+msg + v.length + "  Содержимое / Contain : ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest("Четыре параметра переменной длины / Four variable arity methods: ", 10, 15, 20, 14);
        vaTest(10, 15, 20, 14);
        vaTest(true, false, true, true, false);
    }
}
