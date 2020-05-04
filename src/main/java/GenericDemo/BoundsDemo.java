package GenericDemo;

/**
 * A generic type can be restricted, by type of class or/and one to many
 * interface types (by using logical operator AND). Keyword 'extends' to set
 * upper boundaries. Keyword 'super' to set lover boundaries.
 *
 * @author Bohdan Skrypnyk
 */
// extends class 'Number' to restrict a generic type,
// so it will not give to use not numeric types.
class Stats<T extends Number> {

    T[] nums;  // massive of the objects of the type 'T'

    public Stats(T[] obj) {
        this.nums = obj;
    }

    // getter for the 'nums' massive
    public T[] getObj() {
        return nums;
    }

    // always return type double
    public double average() {
        double sum = 0.0;
        for (int a = 0; a < nums.length; a++) {
            sum += nums[a].doubleValue();
        }
        return sum / nums.length;
    }

    // <?> is unbounded wildcard enable usage of all data types
    public boolean sameAver(Stats<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }
}

public class BoundsDemo {

    public static void main(String args[]) {

        Integer iarr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        // create an object of the type 'Stats' for massive of integers
        Stats<Integer> istat = new Stats<Integer>(iarr);
        double inum = istat.average();
        System.out.println("Average Integer : " + inum);

        Double darr[] = {1.0, 3.0, 1.9, 4.6, 5.2, 1.0, 3.6, 4.2, 9.0, 7.8};

        // create an object of the type 'Stats' for massive of double
        Stats<Double> dstat = new Stats<Double>(darr);
        double dnum = dstat.average();
        System.out.println("Average Double : " + dnum);

        Float farr[] = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f};

        // create an object of the type 'Stats' for massive of float
        Stats<Float> fstat = new Stats<Float>(farr);
        double fnum = fstat.average();
        System.out.println("Average Float : " + fnum);

        System.out.println("Average of Float : " + fnum + " and Double : " + dnum);
        if (fstat.sameAver(dstat)) {
            System.out.println("Equal");
        } else {
            System.out.println("Different");
        }

        System.out.println("Average of Integer : " + inum + " and Float : " + fnum);
        if (istat.sameAver(fstat)) {
            System.out.println("Equal");
        } else {
            System.out.println("Different");
        }
    }
}
