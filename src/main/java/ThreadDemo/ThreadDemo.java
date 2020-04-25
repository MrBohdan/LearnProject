package ThreadDemo;

/**
 *
 * @author Bohdan Skrypnyk
 */
//New Thread
//class NewThread implements Runnable {
//
//    Thread tred;
//
//    NewThread() {
//        //Create new thread. "this" is linked to "run" method
//        tred = new Thread(this, "Demonstrative thread");
//
//        System.out.println("Second thread created " + tred);
//        tred.start(); // run main thread , after this point NewThread and Main thread is running in parallel on one core 
//    }
//
//    //Enter point of second thread
//    @Override
//    public void run() {
//        for (int i = 5; i > 0; --i) {
//            System.out.println("Second thread :" + i);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                System.out.println("Second thread is interrupted");
//            }
//        }
//        System.out.println("Second thread finished");
//    }
//
//}

class NewThread extends Thread {

    NewThread() {
        //Create new thread. "this" is linked to "run" method
        super("Demonstrative thread");

        System.out.println("Second thread created " + this);
        start(); // run main thread , after this point NewThread and Main thread is running in parallel on one core 
    }

    //Enter point of second thread
    @Override
    public void run() {
        for (int i = 5; i > 0; --i) {
            System.out.println("Second thread :" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("Second thread is interrupted");
            }
        }
        System.out.println("Second thread finished");
    }

}

public class ThreadDemo {

    public static void main(String args[]) {
        new NewThread(); // Create new thread 

        for (int i = 5; i > 0; --i) {
            System.out.println("Main thread :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Second thread is interrupted");
            }
        }
        System.out.println("Main thread finished");
    }
}
