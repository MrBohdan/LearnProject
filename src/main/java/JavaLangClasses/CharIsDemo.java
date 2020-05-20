package JavaLangClasses;

/**
 * A class 'Character' contains several methods that divide symbols into
 * different categories.
 *
 * @author Bohdan Skrypnyk
 */
public class CharIsDemo {

    public static void main(String args[]) {
        char ch[] = {'a', 'B', '?', '5', 'e', '4', '-', ' '};

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                System.out.println(ch[i] + " : is a Digit");
            }
            if (Character.isLetter(ch[i])) {
                System.out.println(ch[i] + " : is a Letter");
            }
            if (Character.isWhitespace(ch[i])) {
                System.out.println(ch[i] + " : is a White Space");
            }
            if (Character.isUpperCase(ch[i])) {
                System.out.println(ch[i] + " : is a Upper Case");
            }
            if (Character.isLowerCase(ch[i])) {
                System.out.println(ch[i] + " : is a Lower Case");
            }
        }
    }
}
