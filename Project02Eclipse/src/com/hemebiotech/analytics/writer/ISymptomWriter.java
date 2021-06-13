package com.hemebiotech.analytics.writer;

import java.util.List;
import java.util.Map;

/**
 * Anything that will write the symptoms occurrences in a file
 */
public interface ISymptomWriter {

    /**
     * Aims to write Symptoms occurrences within file
     *
     * @param mapOccurrences : A map of occurrences that will be written in the file
     */
    void writeSymptomsOccurrences(Map<String, Integer> mapOccurrences);

}


