package ThreadDemo;

/**
 * A class 'ThreadGroup' allow a controlling group of the threads as a single
 * tread.
 *
 * @author Bohdan Skrypnyk
 */
class NewThread4 extends Thread {

    boolean suspendFlag;

    public NewThread4(ThreadGroup tg, String string) {
        super(tg, string);
        System.out.println("New Thread :" + this);
        suspendFlag = false;
        start(); // run thread
    }

    // enter point to the thread
    @Override
    public void run() {
        try {
            // the run loop which counts from 5 to 0
            for (int i = 5; i > 0; i--) {
                // display name of running thread
                System.out.println(this.getName() + " : " + i);

                Thread.sleep(1000);

                // check conditions of the flag. If it's "true", than thread is waiting
                synchronized (this) {
                    while (suspendFlag) { // while true, will wait
                        wait();
                    }
                }
            }
        } catch (InterruptedException ex) {
            System.out.println(">Interrupted Exception in " + this.getName());
        }
    }

    synchronized void mysuspend() {
        // Set flag as "true", to activate "wait();" method
        suspendFlag = true;
    }

    synchronized void myresume() {
        // Set flag as "false", to skip "wait();" method
        suspendFlag = false;

        //This method return control to thred
        notify();
    }
}

public class ThreadGroupDemo {

    public static void main(String args[]) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");

        NewThread4 thr1 = new NewThread4(groupA, "First");
        NewThread4 thr2 = new NewThread4(groupA, "Second");
        NewThread4 thr3 = new NewThread4(groupB, "Third");
        NewThread4 thr4 = new NewThread4(groupB, "Fourth");
        NewThread4 thr5 = new NewThread4(groupB, "Fifth");

        System.out.println("\n>Output from a method list() : ");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println(">Suspend group A : ");

        // get number of active thread in group and subgroup
        Thread tga[] = new Thread[groupA.activeCount()];

        // copy to array 'tga' every active thred in group
        groupA.enumerate(tga);

        // loop to suspend each thread in a group individually 
        for (int a = 0; a < tga.length; a++) {

            // suspend all threads in a group
            ((NewThread4) tga[a]).mysuspend();
        }

        try {
            Thread.sleep(4000); // will stop the execution of group A for 4 seconds
        } catch (InterruptedException ex) {
            System.out.println(">Main thread Interrupted");
        }

        System.out.println(">Resume group A : ");

        // loop to resume each thread in a group individually 
        for (int a = 0; a < tga.length; a++) {

            // resume all threads in a group
            ((NewThread4) tga[a]).myresume();
        }

        // wait for finishing of all threads, before main thread will be finished
        try {
            thr1.join();
            thr2.join();
            thr3.join();
            thr4.join();
        } catch (InterruptedException ex) {
            System.out.println(">Main thread Interrupted");
        }
        System.out.println(">Main thread finished");
    }
}
