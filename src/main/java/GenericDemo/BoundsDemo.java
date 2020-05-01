package GenericDemo;

/**
 * A generic type can be restricted, by type of class or/and one to many
 * interface types (by using logical operator AND).
 *
 * @author Bohdan Skrypnyk
 */
// extends class 'Number' to restrict a generic type,
// so it will not give to use not numeric types.
class Stats<T extends Number> {

    T[] nums;

    public Stats(T[] obj) {
        this.nums = obj;
    }

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
}

public class BoundsDemo {

    public static void main(String args[]) {

        Integer iarr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        Stats<Integer> ist = new Stats<Integer>(iarr);

        System.out.println("Average num : " + ist.average());

        Double darr[] = {11.0, 23.0, 11.9, 4.6, 5.2, 1.1, 3.6, 4.2, 9.7, 17.8, 110.5};
        Stats<Double> dst = new Stats<Double>(darr);

        System.out.printf("Average num : " + dst.average());
    }
}
