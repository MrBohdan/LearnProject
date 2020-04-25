package ThreadDemo;

/**
 *
 * @author Bohdan Skrypnyk
 */
class NewThread2 implements Runnable {

    String name;
    Thread tred;

    NewThread2(String treadname) {
        name = treadname;
        tred = new Thread(this, name); //Doesn't whant to run without traget and name 

        //tred.setPriority(Thread.MAX_PRIORITY);
        tred.setPriority(Thread.MIN_PRIORITY);

        System.out.println("New thread" + tred);

        tred.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 10; i > 0; --i) {
                System.out.println(name + " thread : " + i);

                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println(name + "thread interrupted");
        }
        System.out.println(name + "thread finished");
    }
}

public class DemoJoin {

    public static void main(String args[]) {
        NewThread2 mytred1 = new NewThread2("First");
        NewThread2 mytred2 = new NewThread2("Second");
        NewThread2 mytred3 = new NewThread2("Third");

        //isAlive() check if thread is active adn return true/false 
        System.out.println("First thread runned " + mytred1.tred.isAlive());
        System.out.println("Second thread runned " + mytred2.tred.isAlive());
        System.out.println("Third thread runned " + mytred3.tred.isAlive());

        //Threads finished after method join(); return control 
        try {
            System.out.println("Waiting while threads will be finished");
            mytred1.tred.join();
            mytred2.tred.join();
            mytred3.tred.join();
        } catch (InterruptedException ex) {
            System.out.println("Thread interrupted");
        }

        System.out.println("First thread runned " + mytred1.tred.isAlive());
        System.out.println("Second thread runned " + mytred2.tred.isAlive());
        System.out.println("Third thread runned " + mytred3.tred.isAlive());

        System.out.println("Main thread finished");
    }
}
