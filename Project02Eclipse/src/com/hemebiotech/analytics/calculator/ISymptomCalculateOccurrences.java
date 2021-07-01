package com.hemebiotech.analytics.calculator;

import java.util.List;
import java.util.Map;

/**
 * Anything that will calculate the symptoms occurrences dynamically
 * The major goal here is to get the occurrence of each symptom
 */
public interface ISymptomCalculateOccurrences {

    /**
     * Aims to bring occurrences by calculating
     *
     * @param symptoms list that will be provided by the reader
     * @return This method should return the symptoms with their number of occurrences
     */
    Map<String, Integer> getOccurrences(List<String> symptoms);


}
