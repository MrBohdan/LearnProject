package CollectionsDemo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * An interface 'Comparator', is used to manipulate the order in collections.
 *
 * The 'compareTo()' method, is used to compare strings.
 *
 * @author Bohdan Skrypnyk
 */
class Cities implements Comparator<Cities> {

    private  String name;
    private  String state;
    private  double debt;

    // constructor with parameters
    public Cities(String name, String state, double debt) {
        this.name = name;
        this.state = state;
        this.debt = debt;
    }

    // the overloaded constructor with no parameters 
    public Cities() {
        this.name = "";
        this.state = "";
        this.debt = -1;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public double getDebt() {
        return debt;
    }

    void show() {
        System.out.println("City name : " + getName()
                + ", located in the State : " + getState()
                + ", has debit : " + getDebt() + " billion USD.");
    }

    // compare cities names in reverse order
    @Override
    public int compare(Cities name1, Cities name2) {
        return name2.getName().compareTo(name1.getName());
    }
}

public class ComparatorDemo {

    public static void main(String args[]) {

        // create the objects of the type 'Cities' 
        Cities ct1 = new Cities("Eufaula", "Alabama", 54.44);
        Cities ct2 = new Cities("Homer", "Alaska", 250.60);
        Cities ct3 = new Cities("New York", "City in New York State", 119.44);
        Cities ct4 = new Cities("Scottsdale", "Arizona", 25.44);
        Cities ct5 = new Cities("Forrest City", "Arkansas", 11.4);
        Cities ct6 = new Cities("Bakersfield", "California", 7.5);

        // initialization of the 'TreeSet' with the type 'Cities'
        TreeSet<Cities> ts = new TreeSet(new Cities());

        // add the objects to the 'TreeSet'
        ts.add(ct1);
        ts.add(ct2);
        ts.add(ct3);
        ts.add(ct4);
        ts.add(ct5);
        ts.add(ct6);

        // display 'TreeSet'
        for (Cities ct : ts) {
            ct.show();
        }

        System.out.println("Same with a 'reversed()' method ");

        // initialization of the 'TreeSet' with the type 'Cities'
        // will reverse the previous collection
        TreeSet<Cities> ts1 = new TreeSet(ct1.reversed());

        // add the objects from 'ts' to the 'ts1'
        ts1.addAll(ts);

        // display 'TreeSet'
        ts1.forEach((c) -> {
            c.show();
        });

    }
}
