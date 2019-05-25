package com.company;

import java.util.List;

abstract class Factory {
    public void getSearchingLines(List<String> inputList, List<String> patternsList) {
        Searchable s = createSearch();
        s.search(inputList, patternsList);
    }

    public abstract Searchable createSearch();
}
