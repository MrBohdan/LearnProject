package CollectionsDemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Class 'Properties' extends 'Hashtable' class is used to store the list where
 * key and value are strings.
 *
 * A method 'store()' is used to save values to 'Properties'.
 *
 * A method 'load()' is used to load values to 'Properties'.
 *
 * @author Bohdan Skrypnyk
 */
public class PropertiesDemo1 {

    private static Properties properties;
    private static BufferedReader bufferedReader;
    private static String DB_URL = "C:\\data\\db\\testDB.dat";
    private static String city, state;
    private static FileInputStream fileInputStream = null;
    private static FileOutputStream fileOutputStream = null;
    private static boolean flagChange = false;

    public static void main(String args[]) throws IOException {
        // initialization of a 'Properties' class
        properties = new Properties();
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // try to open file
        try {
            fileInputStream = new FileInputStream(DB_URL);
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }

        // if the file is not empty will load data to 'Properties'
        try {
            if (fileInputStream != null) {
                properties.load(fileInputStream);
                fileInputStream.close(); // close stream
            }
        } catch (IOException ex) {
            System.out.println("IOException");
        }

        // used to enter values
        do {
            System.out.println("Enter city name or 'exit' to terminate the system");
            city = bufferedReader.readLine();
            if (city.equals("exit")) {
                continue;
            }
            System.out.println("Enter the State name");
            state = bufferedReader.readLine();
            properties.put(city, state);
            flagChange = true;
        } while (!state.equals("exit"));

        // used to save new changes
        if (flagChange) {
            fileOutputStream = new FileOutputStream(DB_URL);
            properties.store(fileOutputStream, "Records");
            fileOutputStream.close();
        }

        // used to display 
        do {
            System.out.println("Enter city name for search or 'exit' to terminate the system");
            city = bufferedReader.readLine();
            if (city.equals("exit")) {
                continue;
            }
            System.out.println("Enter the State name");
            state = (String) properties.getProperty(city);
            System.out.println(city + " - " + state);
        } while (!state.equals("exit"));
    }
}
