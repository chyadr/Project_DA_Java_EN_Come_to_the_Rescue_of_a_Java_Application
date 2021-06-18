package com.hemebiotech.analytics.writer;

import java.io.*;
import java.util.Map;

/**
 * Implementation  part
 */
public class WriteSymptomOccurrencesIntoFile implements ISymptomWriter {
    private final String filePath;

    public WriteSymptomOccurrencesIntoFile(String filePath) {
        this.filePath = filePath;

    }

    @Override
    public void writeSymptomsOccurrences(Map<String, Integer> mapOccurrences) {
        if (filePath != null) {
            System.out.println("**************************************** Start Writing to file ***********************************************");
            //BufferedWriter in order to  write the occurrences coming  from memory to results.out.txt file
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(filePath), "utf-8"))) {

                for (Map.Entry<String, Integer> symptomsOccurrence : mapOccurrences.entrySet()) {
                    writer.write(symptomsOccurrence.getKey() + ":" + symptomsOccurrence.getValue());
                    writer.newLine();
                }

            } catch (IOException e) {
                System.out.println("Error occurring during writing into file, please contact your administrator, for more details : " + e.getMessage());
            }
            System.out.println("**************************************** End Writing to file ***********************************************");
        }
    }


}
