package InterfaceDemo;

import java.util.Random;

/**
 *
 * @author Bohdan Skrypnyk
 */
//All variables/methods in interface is final and static. But it's not recomended 
interface SharedConstants {

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
        int prob = (int) (100 * rand.nextDouble()); //value between {@code 0.0} and {@code 1.0} from this
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
