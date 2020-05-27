package CollectionsDemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * The Collection has several algorithms that can be used with collections and
 * mapping.
 *
 * @author Bohdan Skrypnyk
 */
class Cities2 {

    private String cityName;
    private String state;
    private double debt;

    // constructor with parameters
    public Cities2(String name, String state, double debt) {
        this.cityName = name;
        this.state = state;
        this.debt = debt;
    }

    // the overloaded constructor with no parameters 
    public Cities2() {
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

class CompareByCityNames implements Comparator<Cities2> {

    // used to sort by city names in ascending order
    @Override
    public int compare(Cities2 st1, Cities2 st2) {
        return st1.getCityName().compareTo(st2.getCityName());
    }

}

public class AlgorithmsDemo {

    public static void main(String args[]) {

        // initialization of the 'LinkedList' with the types '<Cities2>'
        LinkedList<Cities2> cityList = new LinkedList();

        // add the objects to the 'LinkedList'
        cityList.add(new Cities2("Eufaula", "Alabama", 54.44));
        cityList.add(new Cities2("Homer", "Alaska", 250.60));
        cityList.add(new Cities2("New York", "City in New York State", 119.44));
        cityList.add(new Cities2("Scottsdale", "Arizona", 25.44));
        cityList.add(new Cities2("Forrest City", "Arkansas", 11.4));
        cityList.add(new Cities2("Bakersfield", "California", 7.5));

        // create comparator with reverse order.
        // Firstly it will be sorted by names in 'CompareByCityNames' class 
        // in ascending order and then will be reversed by a 'reverseOrder()' method.  
        Comparator<Cities2> compByCityNames = Collections.reverseOrder(new CompareByCityNames());

        // sort the 'TreeSet' by using reference 'compByCityNames'
        Collections.sort(cityList, compByCityNames);

        System.out.println("List in reverse order : ");

        // to display reverse the 'TreeSet'
        for (Cities2 ct : cityList) {
            ct.show();
        }

        System.out.println("\n" + "Shuffled list : ");

        // to shuffle the 'TreeSet'
        Collections.shuffle(cityList);

        // to display shuffled the 'TreeSet'
        for (Cities2 ct : cityList) {
            ct.show();
        }

    }
}
