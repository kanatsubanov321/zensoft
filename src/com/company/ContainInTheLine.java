package com.company;

import java.util.List;

public class ContainInTheLine extends Factory implements Searchable {
    @Override
    public Searchable createSearch() {
        return new ContainInTheLine();
    }

    @Override
    public void search(List<String> inputList, List<String> patternsList) {
        for (String inputLine : inputList) {
            for (String patternsLine : patternsList) {
                if (inputLine.contains(patternsLine)) {
                    System.out.println(inputLine);
                }
            }
        }
    }
}
