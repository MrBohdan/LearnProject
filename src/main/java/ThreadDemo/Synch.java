package ThreadDemo;

/**
 *
 * @author Bohdan Skrypnyk
 */
class Callme {

    void call(String msg) {
        System.out.print(" [ " + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Thread was interrupted");
        }
        System.out.println(" ] ");
    }
}

class Caller implements Runnable {

    String msg;
    Callme target;
    Thread tred;

    public Caller(Callme targ, String s) {
        msg = s;
        target = targ;
        tred = new Thread(this);
        tred.start();
    }

    @Override
    public void run() {
        synchronized (target) {//synchronized block used to limit access to the methods, while it running
            target.call(msg);
        }
    }
}

public class Synch {

    public static void main(String args[]) {
        Callme targ = new Callme();
        Caller obj1 = new Caller(targ, "new");
        Caller obj2 = new Caller(targ, "synchronized");
        Caller obj3 = new Caller(targ, "way");
        
        //wait for threds to finish
        try {
            obj1.tred.join();
            obj2.tred.join();
            obj3.tred.join();
        } catch (InterruptedException ex) {
            System.out.println("interrupted");
        }
    }
}
