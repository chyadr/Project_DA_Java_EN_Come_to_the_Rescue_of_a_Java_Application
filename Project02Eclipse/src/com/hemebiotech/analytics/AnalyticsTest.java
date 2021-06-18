package com.hemebiotech.analytics;

import com.hemebiotech.analytics.calculator.CalculateSymptomsOccurrences;
import com.hemebiotech.analytics.calculator.ISymptomCalculateOccurrences;
import com.hemebiotech.analytics.reader.ISymptomReader;
import com.hemebiotech.analytics.reader.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.writer.ISymptomWriter;
import com.hemebiotech.analytics.writer.WriteSymptomOccurrencesIntoFile;

import java.util.List;
import java.util.Map;

/**
 * Testing Part
 */
public class AnalyticsTest {

    private static final String filePathReader = "Project02Eclipse\\symptoms.txt";
    private static final String filePathWriter = "Project02Eclipse\\results.out.txt";

    /**
     * @param args : Are params that can be provided in our method(not provided in our case)
     */
    public static void main(String[] args) {

        // using getAbsolutePath in order to get the path as a whole
        ISymptomReader reader = new ReadSymptomDataFromFile(filePathReader);
        ISymptomCalculateOccurrences calculator = new CalculateSymptomsOccurrences();
        ISymptomWriter writer = new WriteSymptomOccurrencesIntoFile(filePathWriter);
        // I called my methods from my  classes to read file, calculate occurrences and write the symptoms:their occurrences
        List<String> symptoms = reader.GetSymptoms();
        Map<String, Integer> mapOccurrences = calculator.getOccurrences(symptoms);
        writer.writeSymptomsOccurrences(mapOccurrences);

    }


}
