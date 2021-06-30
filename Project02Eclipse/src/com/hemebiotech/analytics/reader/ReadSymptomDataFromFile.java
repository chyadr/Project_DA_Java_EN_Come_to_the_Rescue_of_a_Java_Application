package com.hemebiotech.analytics.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation part
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    // This might be final because the initial value will keep the same
    // Rename field from filepath  to filePath by following java convention naming
    private final String filePath;  // Private String filepath;

    /**
     * @param filePath: A full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile(String filePath) {
        this.filePath = filePath;
    }

    @Override
    // rename from GetSymptoms to getSymptoms by following java convention name
    public List<String> getSymptoms() {
        // https://stackoverflow.com/questions/7716435/why-would-you-declare-an-interface-and-then-instantiate-an-object-with-it-in-jav
        // Coding to an interface, long term
        // for example if we have 2 variables of List(interface) type, Arraylist(class) and LinkedList(class), we can affect the result
        // of each one to the other, Else we will have a compilation error
        // I removed type<String> from instantiation part, because it's useful (proposed by Intellij)
        List<String> result = new ArrayList<>();//ArrayList<String> result = new ArrayList<String>();


        if (filePath != null) {
            System.out.println("**************************************** Start Reading from file ***********************************************");
            // Methode 1/ I added a try with resources in order to close the resource automatically
            // Methode 2/ we can add a finally after catch
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {    //try {
                // class BuffredReader in order to read the file and add it to the memory																			// BufferedReader reader = new BufferedReader (new FileReader(filepath));
                // https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
                // refactor code : readLine from file and test if it's != null in the same time (same code bloc)
                String line;                                    // String line = reader.readLine();
                while ((line = reader.readLine()) != null) {    // while (line != null) {
                    result.add(line);                            // result.add(line);
                    // line = reader.readLine();
                }
                //reader.close();
            } catch (IOException e) {
                System.out.println("Error occuring during reading from file, please contact your administrator, for more details : " + e.getMessage());
            }

            System.out.println("**************************************** End Reading from file ***********************************************");
        }

        return result;
    }

}
