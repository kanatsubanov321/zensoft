package com.company;

import java.util.List;

abstract class Factory {
    public static Searchable getSearch(Object object, List<String> inputList, List<String> patternsList) {
        Searchable s = null;
        if (object instanceof ContainInTheLine) {
            s = new ContainInTheLine();
        } else if (object instanceof ExactlyTheSame) {
            s = new ExactlyTheSame();
        } else if (object instanceof DistanceEditing) {
            s = new DistanceEditing();
        }
        s.search(inputList, patternsList);
        return s;
    }
}
