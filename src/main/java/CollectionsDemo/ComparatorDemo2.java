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
class Cities1 {

    private  String cityName;
    private  String state;
    private  double debt;

    // constructor with parameters
    public Cities1(String cityName, String state, double debt) {
        this.cityName = cityName;
        this.state = state;
        this.debt = debt;
    }

    // the overloaded constructor with no parameters 
    public Cities1() {
        this.cityName = "";
        this.state = "";
        this.debt = -1;
    }

    // getters
    public String getCityName() {
        return cityName;
    }

    public String getState() {
        return state;
    }

    public double getDebt() {
        return debt;
    }

    void show() {
        System.out.println("City name : " + getCityName()
                + ", located in the State : " + getState()
                + ", has debit : " + getDebt() + " billion USD.");
    }
}

public class ComparatorDemo2 {

    public static void main(String args[]) {

        // create the objects of the type 'Cities1' 
        Cities1 ct1 = new Cities1("Eufaula", "Alabama", 54.44);
        Cities1 ct2 = new Cities1("Homer", "Alaska", 250.60);
        Cities1 ct3 = new Cities1("New York", "City in New York State", 119.44);
        Cities1 ct4 = new Cities1("Scottsdale", "Arizona", 25.44);
        Cities1 ct5 = new Cities1("Forrest City", "Arkansas", 11.4);
        Cities1 ct6 = new Cities1("Bakersfield", "California", 7.5);

        // lambda expression for the comparator with the type 
        // 'City' which will sort in ascending order.
        Comparator<Cities1> comp = (name1, name2) -> name1.getCityName().compareTo(name2.getCityName());

        // initialization of the 'TreeSet' with the type 'Cities'
        TreeSet<Cities1> st = new TreeSet(comp);

        // add the objects to the 'TreeSet'
        st.add(ct1);
        st.add(ct2);
        st.add(ct3);
        st.add(ct4);
        st.add(ct5);
        st.add(ct6);

        // to display 'TreeSet'
        for (Cities1 ci : st) {
            ci.show();
        }
    }
}
