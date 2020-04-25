package ThreadDemo;

/**
 *
 * @author Bohdan Skrypnyk
 */
class Q {

    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                wait(); // Will wait while Producer notify, that data was readed 
            } catch (InterruptedException ex) {
                System.out.println("InterruptedException");
            }
        }

        System.out.println("Received " + n);
        valueSet = false;
        /**
         * When data is received in get(); method, system call notify(); method,
         * than Producer know that everything is OK and Producer can allocate
         * next data
         */
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait();// 
            } catch (InterruptedException ex) {
                System.out.println("InterruptedException");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Sended " + n);
        notify();
    }
}

class Producer implements Runnable {

    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer ").start();
    }

    @Override
    public void run() {
        int a = 0;

        while (true) {
            q.put(a++);
        }
    }

}

class Consumer implements Runnable {

    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer ").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }

}

public class PC {

    public static void main(String args[]) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("To terminate press Ctrl + C");
    }
}
