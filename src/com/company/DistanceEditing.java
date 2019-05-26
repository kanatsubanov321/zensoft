package com.company;

import java.util.List;

public class DistanceEditing implements Searchable {
    @Override
    public void search(List<String> inputList, List<String> patternsList) {
        Levenshtein lev = new Levenshtein();
        for (String inputLine : inputList) {
            for (String patternsLine : patternsList) {
                if (lev.distance(inputLine, patternsLine) <= 1) {
                    System.out.println(inputLine);
                }
            }
        }
    }
}