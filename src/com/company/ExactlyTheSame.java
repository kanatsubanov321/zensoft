package com.company;

import java.util.List;

public class ExactlyTheSame implements Searchable {

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

