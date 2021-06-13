package com.hemebiotech.analytics;

import com.hemebiotech.analytics.calculator.CalculateSymptomsOccurrences;
import com.hemebiotech.analytics.calculator.ISymptomCalculateOccurrences;
import com.hemebiotech.analytics.reader.ISymptomReader;
import com.hemebiotech.analytics.reader.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.writer.ISymptomWriter;
import com.hemebiotech.analytics.writer.WriteSymptomOccurrencesIntoFile;

import java.io.File;
import java.util.List;
import java.util.Map;

public class AnalyticsTest {

    private static final String filePathReader="Project02Eclipse\\symptoms.txt";
    private static final String filePathWriter="Project02Eclipse\\results.out.txt";


    public static void main(String[] args) {

        // This allows program to work in all Windows machines by retrieving automatically file path
        // .// indicate use current directory
        File currentDirectoryReader = new File(".\\"+filePathReader);
        File currentDirectoryWriter = new File(".\\"+filePathWriter);

        // using getAbsolutePath in order to get the path as a whole
        ISymptomReader reader = new ReadSymptomDataFromFile(currentDirectoryReader.getAbsolutePath());
        ISymptomCalculateOccurrences calculator = new CalculateSymptomsOccurrences();
        ISymptomWriter writer= new WriteSymptomOccurrencesIntoFile(currentDirectoryWriter.getAbsolutePath());
        // I called my methods from my  classes to read file, calculate occurrences and write the symptoms:their occurrences
        List<String> symptoms = reader.GetSymptoms();
        Map<String,Integer> mapOccurrences = calculator.getOccurrences(symptoms);
        writer.writeSymptomsOccurrences(mapOccurrences);

    }


}
