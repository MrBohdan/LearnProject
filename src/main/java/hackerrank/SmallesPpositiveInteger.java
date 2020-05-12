package hackerrank;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Bohdan Skrypnyk
 */
public class SmallesPpositiveInteger {

    public static int solution(int[] A) {
        int num = A.length;
        Set<Integer> arr = new HashSet<>();
        for (Integer a : A) {
            if (a > 0) {
                arr.add(a);
            }
        }
        int ret = 0;
        for (int i = 1; i <= num + 1; i++) {
            if (!arr.contains(i)) {
                return i;
            }
        }
        return ret;
    }

    public static void main(String args[]) {
        int num[] = {1, 3, 6, 4, 1, 2}; // should return 5
        System.out.println(solution(num));
        int num1[] = {1, 2, 3}; // should return 4
        System.out.println(solution(num1));
        int num2[] = {-1, -3};  // should return 1
        System.out.println(solution(num2));
    }
}
