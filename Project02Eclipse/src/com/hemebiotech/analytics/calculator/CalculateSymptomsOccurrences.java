package com.hemebiotech.analytics.calculator;

import java.util.*;

/**
 * Implementation part
 */
public class CalculateSymptomsOccurrences implements ISymptomCalculateOccurrences {


    @Override
    public Map<String,Integer> getOccurrences(List<String> symptoms) {
        System.out.println("**************************************** Start Calculating from List ***********************************************");
        Map<String,Integer> mapOccurrences = new TreeMap<>();
        for (String symptom : symptoms) {

            mapOccurrences.put(symptom, mapOccurrences.getOrDefault(symptom, 0) + 1);

        }
        System.out.println("**************************************** End Calculating from List ***********************************************");

        return mapOccurrences;

    }


}
