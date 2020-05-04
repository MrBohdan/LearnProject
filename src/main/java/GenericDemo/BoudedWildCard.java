package GenericDemo;

/**
 * A generic type can be restricted, by type of class or/and one to many
 * interface types (by using logical operator AND). Keyword 'extends' to set the
 * upper boundaries. Keyword 'super' to set the lover boundaries.
 *
 * @author Bohdan Skrypnyk
 */
// two d coordinates
class TwoD {

    int x, y;

    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// three d coordinates
class ThreeD extends TwoD {

    int z;

    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

// four d coordinates
class FourD extends ThreeD {

    int t;

    public FourD(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}

// class to keep massive of coordinates
class Coords<T extends TwoD> {

    T[] coord;

    public Coords(T[] coord) {
        this.coord = coord;
    }
}

public class BoudedWildCard {

    // method to show coordinates X and Y
    public static void showXY(Coords<?> c) {
        System.out.println("Coordinates X and Y");

        for (int i = 0; i < c.coord.length; i++) {
            System.out.println("X: " + c.coord[i].x
                    + " Y: " + c.coord[i].y + "\n");
        }
    }

    // method to show coordinates X, Y and Z
    // the class 'ThreeD' are set the upper boundary 
    public static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("Coordinates X, Y and Z");

        for (int i = 0; i < c.coord.length; i++) {
            System.out.println("X : " + c.coord[i].x
                    + " Y: " + c.coord[i].y
                    + " Z: " + c.coord[i].z + "\n");
        }
    }

    // method to show coordinates X, Y, Z and T
    // the class 'FourD' are set the upper boundary 
    public static void showAll(Coords<? extends FourD> c) {
        System.out.println("Coordinates X, Y, Z and T");

        for (int i = 0; i < c.coord.length; i++) {
            System.out.println("X: " + c.coord[i].x
                    + " Y: " + c.coord[i].y
                    + " Z: " + c.coord[i].z
                    + " T: " + c.coord[i].t + "\n");
        }
    }

    public static void main(String args[]) {
        // create massive of 'TwoD' objects  
        TwoD twod[] = {
            new TwoD(10, 5),
            new TwoD(2, 3),
            new TwoD(4, 7),
            new TwoD(-14, -0)};

        // create an object of the type 'Coords' for 'TwoD' class
        Coords<TwoD> objTwoD = new Coords<TwoD>(twod);

        showXY(objTwoD);

        // create massive of 'ThreeD' objects  
        ThreeD threed[] = {
            new ThreeD(0, 0, 4),
            new ThreeD(4, 5, 3),
            new ThreeD(7, 7, 1),
            new ThreeD(-14, -0, -12)};

        // create an object of the type 'Coords' for 'ThreeD' class
        Coords<ThreeD> objThreeD = new Coords<ThreeD>(threed);

        showXYZ(objThreeD);

        // create massive of 'FourD' objects  
        FourD fourd[] = {
            new FourD(0, 0, 4, 3),
            new FourD(4, 5, 3, 1),
            new FourD(7, 7, 1, 5),
            new FourD(-14, -0, -12, 8)};

        // create an object of the type 'Coords' for 'FourD' class
        Coords<FourD> objFourD = new Coords<FourD>(fourd);

        showAll(objFourD);
    }
}
