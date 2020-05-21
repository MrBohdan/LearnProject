package JavaLangClasses;

/**
 * A class 'Package' is used to get information about package.
 * 
 * @author Bohdan Skrypnyk
 */
public class PackageDemo {

    public static void main(String args[]) {
        Package pk[];

        pk = Package.getPackages();

        for (int a = 1; a < pk.length; a++) {
            System.out.println(a + "\n" + "Name of this package : " + pk[a].getName() + " \n"
                    + "Title of this package : " + pk[a].getImplementationTitle() + " \n"
                    + "Name of the organization : " + pk[a].getImplementationVendor() + " \n"
                    + "Specification that this package implements : " + pk[a].getSpecificationTitle() + " \n"
                    + "Name of the organization, vendor, or company that owns and maintains the specification : " + pk[a].getSpecificationVendor() + " \n"
                    + "version number of the specification that this package implements : " + pk[a].getSpecificationVersion());
        }
    }
}
