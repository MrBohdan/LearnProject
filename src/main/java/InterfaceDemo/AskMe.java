package InterfaceDemo;

import java.util.Random;

/**
 * "One Interface multiple implementations". Interfaces cannot be used to create
 * objects. All methods, variables static, and final (constant) by default. All
 * methods in interface usually have empty methods. The subclass should
 * implement all methods from the interface, but each subclass can implement
 * these methods in a different way. To access the different method
 * implementation through interface (Ex: MyInterface obj = new Class()).
 * Interfaces can be nested in the class then they can be public\private.
 *
 * @author Bohdan Skrypnyk
 */
//All variables/methods in interface is final and static. But it's not recomended 
interface SharedConstants { // for this purpose Enum classes are better

    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}

class Questions implements SharedConstants {

    Random rand = new Random();

    public int ask() {
        
        // random return value between {0.0} and {1.0}
        int prob = (int) (100 * rand.nextDouble()); 
        if (prob < 30) {
            return NO;   // 30 %
        } else if (prob < 45) {
            return YES;   // 15 %
        } else if (prob < 60) {
            return MAYBE;   // 15 %
        } else if (prob < 75) {
            return LATER;   // 15 %
        } else if (prob < 98) {
            return SOON;   // 13 %
        } else {
            return NEVER;  // 2 %
        }
    }
}

public class AskMe implements SharedConstants {

    public static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("NO");
                break;
            case YES:
                System.out.println("YES");
                break;
            case MAYBE:
                System.out.println("MAYBE");
                break;
            case LATER:
                System.out.println("LATER");
                break;
            case SOON:
                System.out.println("SOON");
                break;
            case NEVER:
                System.out.println("NEVER");
                break;
        }
    }

    public static void main(String args[]) {
        Questions q = new Questions();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
