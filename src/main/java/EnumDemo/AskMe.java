package EnumDemo;

import java.util.Random;

/**
 * Enum - a special type of class, with constant/final variables. There is no
 * way to create a new instance of enum class by using "new". Enum class cannot
 * be a superclass and cannot inherit from other classes, but it working the
 * same as usual class, so there can be initialized constructors, methods, and
 * so on.
 *
 * @author Bohdan Skrypnyk
 */
enum Answers {
    NO,
    YES,
    MAYBE,
    LATER,
    SOON,
    NEVER;
}

class Questions {

    Random ran = new Random();

    Answers ask() {
        int prob = (int) (100 * ran.nextDouble());

        if (prob < 15) {
            return Answers.NO;// 15% chance 
        } else if (prob < 35) {
            return Answers.YES;// 20% chance 
        } else if (prob < 55) {
            return Answers.MAYBE;// 20% chance
        } else if (prob < 70) {
            return Answers.LATER;// 15% chance 
        } else if (prob < 98) {
            return Answers.SOON; // 28% chance 
        } else {
            return Answers.NEVER;// 2% chance 
        }
    }

}

public class AskMe {

    public static void answers(Answers ans) {
        switch (ans) {
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
        Questions qes = new Questions();
        answers(qes.ask());
        answers(qes.ask());
        answers(qes.ask());
        answers(qes.ask());
        answers(qes.ask());
    }
}
