package com.hemebiotech.analytics.writer;

import java.util.List;
import java.util.Map;

public  interface ISymptomWriter {

    /**
     * Aims to write Symptoms occurrences within file
     * @param mapOccurrences map of occurrences that will be written in the file
     */
    void writeSymptomsOccurrences(Map<String,Integer> mapOccurrences);

}


