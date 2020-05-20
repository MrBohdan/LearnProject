package JavaLangClasses;

/**
 * A method 'currentTimeMillis()' is allowed to measure the time of the system
 * running. It return time from January 1, 1970 UTC.
 *
 * @author Bohdan Skrypnyk
 */
public class Elapsed {

    public static void main(String args[]) {
        long start, end;
        long start1, end1;

        System.out.println("Measure enumeration time from 0 to 100000000");

        start = System.currentTimeMillis(); // set beginning time in Millis
        start1 = System.nanoTime();  // set beginning time in Nano Sec

        for (int i = 0; i <= 100000000L; i++) ;

        end = System.currentTimeMillis(); // set end time in Millis
        end1 = System.nanoTime(); // set end time in Nano Sec

        // count difference between the beginning time and the end time.
        System.out.println("Time of running : " + (end - start) + " Millis");
        System.out.println("Time of running : " + (end1 - start1) + " Nano Sec");
    }
}
