package com.company;

import java.util.List;

public class ExactlyTheSame extends Factory implements Searchable {
    @Override
    public Searchable createSearch() {
        return new ExactlyTheSame();
    }

    @Override
    public void search(List<String> inputList, List <String> patternsList) {
        for (String inputLine : inputList) {
            for (String patternsLine : patternsList) {
                if (inputLine.equals(patternsLine)) {
                    System.out.println(inputLine);
                }
            }
        }
    }
}

