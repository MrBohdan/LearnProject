package ThreadDemo;

/**
 *
 * @author Bohdan Skrypnyk
 */
// Create several threads to run 
class NewThread1 implements Runnable {

    String name; // name of the thread
    Thread tred;

    NewThread1(String threadname) {
        name = threadname;

        tred = new Thread(this, name);
        System.out.println(name + " thread :" + tred);
        tred.start();

    }

    @Override
    public void run() {
        for (int i = 10; i > 0; --i) {
            System.out.println(name + " thread : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Second thread Interrupted");
            }
        }
        System.out.println(name + " thred finished");
    }

}

public class MultiThreadDemo {

    public static void main(String args[]) {
        new NewThread1("First"); // run threads
        new NewThread1("Second");
        new NewThread1("Third");
        try {
            Thread.sleep(12000); // main thread should be finushed after all threads
        } catch (InterruptedException ex) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thred finished");
    }
}
