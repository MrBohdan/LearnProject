package ThreadDemo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bohdan Skrypnyk
 */

public class CurrentTreadDemo {

    public static void main(String args[]) {
        Thread tred = new Thread();

        System.out.println("Cuttent thread " + tred);

        tred.setName("My Thread");

        System.out.println("Cuttent thread " + tred);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Main thread is interrupted");
            }
        }
    }
}
