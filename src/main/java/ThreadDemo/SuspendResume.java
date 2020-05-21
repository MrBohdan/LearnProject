package ThreadDemo;

/**
 * The most common way to pause/resume threads. Old methods pause();, resume();,
 * stop(); working with mistakes
 *
 * @author Bohdan Skrypnyk
 */
class NewThread3 implements Runnable {

    String name; // name of thread
    Thread tred;
    boolean suspendFlag; // Use flag to contol threads

    NewThread3(String threadname) {
        this.name = threadname;
        tred = new Thread(this, name);

        System.out.println("New Thread " + tred);
        suspendFlag = true;

        tred.start();
    }

    // point of enter to thread
    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; --i) {

                System.out.println(name + " thread : " + i);
                Thread.sleep(200);
                synchronized (this) {
                    // check conditions of the Flag. If it's "true", than thread is waiting
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException ex) {
            System.out.println(name + " Interrupted ");
        }
        System.out.println(name + " finished");
    }

    synchronized void mysuspend() {
        suspendFlag = true; // Set flag as "true", to activate "wait();" method
    }

    synchronized void myresume() {
        // Set flag as "false", to skip "wait();" method
        suspendFlag = false;
        // This method return control to thred
        notify();
    }
}

public class SuspendResume {

    public static void main(String args[]) {
        NewThread3 obj1 = new NewThread3("First");
        NewThread3 obj2 = new NewThread3("Second");

        try {
            Thread.sleep(1000);
            obj1.mysuspend();
            System.out.println("First thread suspended");
            Thread.sleep(1000);
            obj1.myresume();
            System.out.println("First thread resumed");

            Thread.sleep(1000);
            obj2.mysuspend();
            System.out.println("Second thread suspended");
            Thread.sleep(1000);
            obj2.myresume();
            System.out.println("Second thread resumed");
        } catch (InterruptedException ex) {
            System.out.println("Interrupted ");
        }

        // wait for finishing of all threads, before main thread will be finished
        try {
            obj1.tred.join();
            obj2.tred.join();
        } catch (InterruptedException ex) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Finished");
    }
}
