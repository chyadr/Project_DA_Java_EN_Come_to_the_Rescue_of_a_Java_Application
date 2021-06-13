package com.hemebiotech.analytics.calculator;

import java.util.*;

/**
 * implementation part
 */
public class CalculateSymptomsOccurrences implements ISymptomCalculateOccurrences {


    @Override
    public  Map<String,Integer > getOccurrences(List<String> symptoms) {
        System.out.println("**************************************** Start Calculating from List ***********************************************");
        Map<String,Integer> mapOccurrences = new HashMap<>();
        for(String symptom:symptoms){
//                if (mapOccurrences.get(symptom) !=null){
            mapOccurrences.put(symptom,mapOccurrences.getOrDefault(symptom, 0)+1);
//                }
//                else {
//                    mapOccurrences.put(symptom,1l);
//                }
        }
        System.out.println("**************************************** End Calculating from List ***********************************************");

        return mapOccurrences;

    }


}
