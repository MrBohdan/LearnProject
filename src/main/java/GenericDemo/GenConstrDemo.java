package GenericDemo;

/**
 * A generic type can be restricted, by type of class or/and one to many
 * interface types (by using logical operator AND). Keyword 'extends' to set the
 * upper boundaries. Keyword 'super' to set the lover boundaries.
 *
 * @author Bohdan Skrypnyk
 */

class GenConstr {

    private double val;

    // 'T extends Number' set upper boundaties for constructor
    <T extends Number> GenConstr(T val) {
        this.val = val.doubleValue();
    }

    public void show() {
        System.out.println("Vali : " + val);
    }
}

public class GenConstrDemo {

    public static void main(String args[]) {
        GenConstr gc = new GenConstr(15);
        GenConstr gc1 = new GenConstr(12.5F);

        gc.show();
        gc1.show();
    }
}
