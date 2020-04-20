package hackerrank;

public class Logical_Op_Table {

    public static void main(String[] args) {
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        boolean p, q;

        p = true;
        q = true;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
        System.out.print(((p ? 1 : 0) & (q ? 1 : 0)) + "\t" + ((p ? 1 : 0) | (q ? 1 : 0)) + "\t");
        System.out.println(((p ? 1 : 0) ^ (q ? 1 : 0)) + "\t" + (!p ? 1 : 0));

        p = true;
        q = false;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
        System.out.print(((p ? 1 : 0) & (q ? 1 : 0)) + "\t" + ((p ? 1 : 0) | (q ? 1 : 0)) + "\t");
        System.out.println(((p ? 1 : 0) ^ (q ? 1 : 0)) + "\t" + (!p ? 1 : 0));

        p = false;
        q = true;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
        System.out.print(((p ? 1 : 0) & (q ? 1 : 0)) + "\t" + ((p ? 1 : 0) | (q ? 1 : 0)) + "\t");
        System.out.println(((p ? 1 : 0) ^ (q ? 1 : 0)) + "\t" + (!p ? 1 : 0));

        p = false;
        q = false;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
        System.out.print(((p ? 1 : 0) & (q ? 1 : 0)) + "\t" + ((p ? 1 : 0) | (q ? 1 : 0)) + "\t");
        System.out.println(((p ? 1 : 0) ^ (q ? 1 : 0)) + "\t" + (!p ? 1 : 0));

        System.out.println("\nP\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = true;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));
    }
}
