package InheritanceDemo;

/**
 *
 * @author Bohdan Skrypnyk
 */
class First {

    int i, j;

    public First(int a, int b) {
        this.i = a;
        this.j = b;
    }

    public void show() {
        System.out.println("(super) i and j : " + i + " " + j);
    }
}

class Second extends First {

    int k;

    public Second(int m, int a, int j) {
        super(a, j);
        this.k = m;
    }

    @Override
    public void show() {
        // to display var from super class
        super.show();
        System.out.println("(subObj) k : " + k);
    }
}

class SimpleOverride {

    public static void main(String args[]) {
        Second seconObj = new Second(12, 33, 11);
        seconObj.show();
    }
}
