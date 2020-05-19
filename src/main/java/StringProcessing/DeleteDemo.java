package StringProcessing;

/**
 * A method 'delete()' is used to delete selected part of the string. A method
 * 'deleteCharAt()' is used to delete character on the selected index.
 *
 * @author Bohdan Skrypnyk
 */
public class DeleteDemo {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Renewable energy is energy that is collected from renewable resources");

        // display string before changing
        System.out.println(sb);

        sb.delete(10, 30); // delete between selected indexes

        // display string after deleting selected substring
        System.out.println(sb);

        sb.deleteCharAt(1); // delete a character on the selected indexes

        // display string after deleting of a character
        System.out.println(sb);
    }
}
