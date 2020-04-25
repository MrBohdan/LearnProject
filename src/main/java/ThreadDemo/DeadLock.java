package ThreadDemo;

/**
 *
 * @author Bohdan Skrypnyk
 */
class A {

    synchronized void foo(B b) {
        String name = new Thread().getName();
        System.out.println(name + " entered in method A.foo();");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Class B Interrupted");
        }

        System.out.println(name + " entered in method A.foo();");
        b.last();
    }

    synchronized void last() {
        System.out.println("Method A.last(); ");
    }
}

class B {

    synchronized void bar(A a) {
        String name = new Thread().getName();
        System.out.println(name + " entered in method B.bar();");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Class B Interrupted");
        }

        System.out.println(name + " entered in method A.last();");
        a.last();
    }

    synchronized void last() {
        System.out.println("Method B.last(); ");
    }
}

class DeadLock implements Runnable {

    A a = new A();
    B b = new B();

    DeadLock() {
        Thread.currentThread().setName("Main Thread");
        Thread tred = new Thread(this, "Rival Thread");

        tred.start();

        a.foo(b);   // get lock for object A
        // in this thread
        System.out.println("Back to main thread");
    }

    @Override
    public void run() {
        b.bar(a);// get lock for object B
        // in another thread
        System.out.println("Back to another thread");
    }

    public static void main(String args[]) {
        new DeadLock();
    }
}
