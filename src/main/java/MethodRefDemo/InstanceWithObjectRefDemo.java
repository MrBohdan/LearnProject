package MethodRefDemo;

/**
 * Method reference operator '::' working similar to Lambda expressions. They
 * both just call a method\constructor\ an instance method.
 *
 * @author Bohdan Skrypnyk
 */
// functional interface 
interface MyFunc<T> {

    boolean func(T t1, T t2);
}

class HighTemp {

    private int hTemp;

    // constructor 
    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    // return 'true' if object type 'HighTemp' has the same value as an object 'ht2'
    boolean sameTemp(HighTemp ht2) {
        return this.hTemp == ht2.hTemp;
    }

    // return 'true' if object type 'HighTemp' has the lower value, than an object 'ht2'
    boolean lessThanTemp(HighTemp ht2) {
        return this.hTemp < ht2.hTemp;
    }

    // getter for the 'hTemp'
    public int gethTemp() {
        return hTemp;
    }

}

public class InstanceWithObjectRefDemo {

    // This method return amount of instances, 
    // which were selected by the criteria of the parameter 'MyFunc'.
    static <T> int counter(T[] val, MyFunc<T> f, T v) {
        int count = 0;

        for (int i = 0; i < val.length; i++) {
            if (f.func(val[i], v)) {
                count++;
            }
        }
        return count;
    }

    // This method return amount of instances, 
    // which were selected by the criteria of the parameter 'MyFunc'.
    static <T> int counter2(T[] val, MyFunc<T> f, T[] v) {
        int count = 0;

        // check each day on week one, with all days on week two
        for (int i = 0; i < val.length; i++) {
            for (int a = 0; a < v.length; a++) {
                if (f.func(val[i], v[a])) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int count;

        // create massive of the type 'HighTemp'
        HighTemp[] weekDaysHighs1 = {new HighTemp(14),
            new HighTemp(13), new HighTemp(22),
            new HighTemp(4), new HighTemp(21),
            new HighTemp(20), new HighTemp(22)};

        // 
        count = counter(weekDaysHighs1, HighTemp::sameTemp, new HighTemp(22));

        System.out.println("Amount of the days, when temperature was 22 : " + count);

        // create massive of the type 'HighTemp'
        HighTemp[] weekDaysHighs2 = {new HighTemp(14),
            new HighTemp(13), new HighTemp(22),
            new HighTemp(10), new HighTemp(21),
            new HighTemp(8), new HighTemp(-2)};

        // use the method 'lessThanTemp', to find how many days the temperature was less than given
        count = counter(weekDaysHighs2, HighTemp::lessThanTemp, new HighTemp(0x14));

        System.out.println("Amount of the days, when temperature was less than 20 : " + count);

        String dayName[] = {"Mon", "Tue", "Wen", "Thu", "Fri", "Sat", "Sun"};

        System.out.println("Week one");
        for (int a = 0; a < weekDaysHighs1.length; a++) {
            System.out.print(dayName[a] + " " + weekDaysHighs1[a].gethTemp() + "°" + ",");
        }

        System.out.println("\nWeek two");
        for (int a = 0; a < weekDaysHighs2.length; a++) {
            System.out.print(dayName[a] + " " + weekDaysHighs2[a].gethTemp() + "°" + ",");
        }

        // use the method 'lessThanTemp', to find how many days the temperature was same with week 2
        count = counter2(weekDaysHighs1, HighTemp::sameTemp, weekDaysHighs2);

        System.out.println("\nAmount of the days, when temperature was same in Week one and Week two : " + count);

        // same with a lambda expression 
        count = counter2(weekDaysHighs1, (highTemp, ht2) -> highTemp.sameTemp(ht2), weekDaysHighs2);

        System.out.println("\n(lambda) Amount of the days, when temperature was same in Week one and Week two : " + count);
    }
}
