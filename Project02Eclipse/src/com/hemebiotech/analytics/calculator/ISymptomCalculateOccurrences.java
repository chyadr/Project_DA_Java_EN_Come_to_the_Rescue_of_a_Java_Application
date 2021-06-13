package com.hemebiotech.analytics.calculator;

import java.util.List;
import java.util.Map;

/**
 * Anything that will calculate the symptoms occurrences dynamically
 * the major goal is to get the occurrence of each symptom
 */
public interface ISymptomCalculateOccurrences {

    /**
     * Aims to bring occurrences
      * @param symptoms
     * @return
     */
    Map<String, Integer> getOccurrences(List<String> symptoms);


}
