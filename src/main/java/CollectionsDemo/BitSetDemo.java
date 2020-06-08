package CollectionsDemo;

import java.util.BitSet;

/**
 * Class 'BitSet' is used to create a special type of array, that contains bites
 * values as the logical value.
 *
 * @author Bohdan Skrypnyk
 */
public class BitSetDemo {

    private static BitSet bset1;
    private static BitSet bset2;

    public static void main(String args[]) {

        // initialize the 'BitSet'
        bset1 = new BitSet(16);
        bset2 = new BitSet(16);

        // setup bit sets
        for (int i = 0; i < 16; i++) {
            if (i % 2 == 0) {// if the remainder is zero
                bset1.set(i);
            }
            if (i % 5 != 0) {// if the remainder is not zero
                bset2.set(i);
            }
        }

        // display bit sets
        System.out.println("Bit set 1 :" + bset1);
        System.out.println("Bit set 2 :" + bset2);

        // apply logical operator AND (return true if both operands is true)
        bset2.and(bset1);
        System.out.println(" bset2.and(bset1) :" + bset2);

        // apply logical operator OR (return true if one of the operands is true)
        bset2.or(bset1);
        System.out.println(" bset2.or(bset1) :" + bset2);

        // apply logical operator XOR (returns true if and only if the operands are different)
        bset2.xor(bset1);
        System.out.println(" bset2.xor(bset1) :" + bset2);
    }
}
