package com.company;

abstract class Factory {

    public static Searchable getSearch(String output) {
        Searchable s = null;
        if (output.equals("exactlyTheSame")) {
            s = new ExactlyTheSame();
        } else if (output.equals("containsInTheLine")) {
            s = new ContainInTheLine();
        } else if (output.equals("distanceEditing")) {
            s = new DistanceEditing();
        }
        return s;
    }
}
