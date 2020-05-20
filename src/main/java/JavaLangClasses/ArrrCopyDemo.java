package JavaLangClasses;

/**
 * A method 'arraycopy()' from the 'String' class, is used to copy massive
 * faster, then use a loop.
 *
 * @author Bohdan Skrypnyk
 */
public class ArrrCopyDemo {

    static byte a[] = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75};
    static byte b[] = {77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77};

    public static void main(String args[]) {
        System.out.println("a : " + new String(a));
        System.out.println("b : " + new String(b));

        System.arraycopy(a, 0, b, 0, a.length);

        System.out.println("a : " + new String(a));
        System.out.println("b : " + new String(b));

        System.arraycopy(a, 0, a, 1, a.length - 1);
        System.arraycopy(b, 1, b, 0, b.length - 1);

        System.out.println("a : " + new String(a));
        System.out.println("b : " + new String(b));

        // get environment values by using method 'getProperty()'
        System.out.println("File separator : " + System.getProperty("file.separator"));

        System.out.println("User separator : " + System.getProperty("user.dir"));
        System.out.println("User home : " + System.getProperty("user.home"));
        System.out.println("User name : " + System.getProperty("user.name"));

        System.out.println("OS name : " + System.getProperty("os.name"));
        System.out.println("OS architecture : " + System.getProperty("os.arch"));
        System.out.println("OS version : " + System.getProperty("os.version"));

        System.out.println("Java class path : " + System.getProperty("java.class.path"));
        System.out.println("Java class version : " + System.getProperty("java.class.version"));
        System.out.println("Java compiler : " + System.getProperty("java.compiler"));
        System.out.println("Java ext dirs : " + System.getProperty("java.ext.dirs"));
        System.out.println("Java home : " + System.getProperty("java.home"));
        System.out.println("Java io temp dir : " + System.getProperty("java.io.tmpdir"));
        System.out.println("Java library path : " + System.getProperty("java.library.path"));
        System.out.println("Java specification name : " + System.getProperty("java.specification.name"));
        System.out.println("Vendor : " + System.getProperty("vendor"));
        System.out.println("Java specification version : " + System.getProperty("java.specification.version"));
        System.out.println("Java vendor : " + System.getProperty("java.vendor"));
        System.out.println("Java vendor url: " + System.getProperty("java.vendor.url"));

        System.out.println("Java vm name : " + System.getProperty("java.vm.name"));
        System.out.println("Java vm specification name : " + System.getProperty("java.vm.specification.name"));
        System.out.println("Java vm specification vendor : " + System.getProperty("java.vm.specification.vendor"));
        System.out.println("Java vm specification version : " + System.getProperty("java.vm.specification.version"));

    }
}
