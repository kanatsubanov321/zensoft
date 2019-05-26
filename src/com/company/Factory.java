package com.company;

abstract class Factory {

    public static Searchable getSearch(String output) {
        Searchable s = null;
        if (output.equals("first")) {
            s = new ExactlyTheSame();
        } else if (output.equals("second")) {
            s = new ContainInTheLine();
        } else if (output.equals("third")) {
            s = new DistanceEditing();
        }
        return s;
    }
}
