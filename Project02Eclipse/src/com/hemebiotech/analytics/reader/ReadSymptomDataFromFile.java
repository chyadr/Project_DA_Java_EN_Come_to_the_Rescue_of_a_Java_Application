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


    private final String filePath;

    /**
     * @param filePath: A full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<String> getSymptoms() {

        List<String> result = new ArrayList<>();

        if (filePath != null) {
            System.out.println("**************************************** Start Reading from file ***********************************************");
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    result.add(line);

                }

            } catch (IOException e) {
                System.out.println("Error occuring during reading from file, please contact your administrator, for more details : " + e.getMessage());
            }

            System.out.println("**************************************** End Reading from file ***********************************************");
        }

        return result;
    }

}
