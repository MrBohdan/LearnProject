package JavaLangClasses;

/**
 * A method 'freeMemory()' is used to get amount of free memory Java Virtual
 * Machine in bytes.
 *
 * A method 'gc()' is used to activate garbage collector.
 *
 * A method 'totalMemory()' is used to get amount of total memory Java Virtual
 * Machine in bytes.
 *
 * @author Bohdan Skrypnyk
 */
public class MemoryDemo {

    public static void main(String args[]) {
        Runtime rn = Runtime.getRuntime();
        double mem1, mem2;

        Integer num[] = new Integer[10000];

        System.out.println("Total memory : " + rn.totalMemory() / Math.pow(2, 20) + " Megabyte");

        mem1 = rn.freeMemory() / Math.pow(2, 20); // get free memory in JVM

        System.out.println("Free memory : " + Math.round(mem1 * 100) / 100.0 + " Megabyte");

        rn.gc();  // run garbage collector

        mem1 = rn.freeMemory() / Math.pow(2, 20); // get free memory in JVM

        System.out.println("Total memory after cleaning: " + Math.round(mem1 * 100) / 100.0 + " Megabyte");

        for (int i = 0; i < num.length; i++) { // allocate memory for the object Integer
            num[i] = new Integer(i);
        }

        mem2 = rn.freeMemory() / Math.pow(2, 20); // get free memory in JVM

        System.out.println("Total memory after allocation: " + Math.round(mem2 * 100) / 100.0 + " Megabyte");

        System.out.println("Used memory for allocation of the type Integer: " + Math.round((mem2 - mem1) * 100) / 100.0 + " Megabyte");

        for (int i = 0; i < num.length; i++) {// remove the object Integer
            num[i] = null;
        }

        rn.gc(); // run garbage collector

        mem2 = rn.freeMemory() / Math.pow(2, 20); // get free memory in JVM

        System.out.println("Total memory after cleaning objects of the type Integer: " + Math.round(mem2 * 100) / 100.0 + " Megabyte");
    }
}
