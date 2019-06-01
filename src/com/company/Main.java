package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Searchable searchable;

    public static Searchable getSearch(int byNumber) {
        switch (byNumber){
            case 1: searchable = Factory.getSearch("exactlyTheSame"); break;
            case 2: searchable = Factory.getSearch("containsInTheLine"); break;
            case 3: searchable = Factory.getSearch("distanceEditing"); break;
            default: searchable = null;
        }
        return searchable;
    }

    public static void main(String[] args) throws Exception {
        FileReader inputReader = new FileReader("input.txt");
        FileReader patternsReader = new FileReader("patterns.txt");

        List<String> inputList = convertToList(inputReader);
        List<String> patternsList = convertToList(patternsReader);

        getSearch(1);
        searchable.search(inputList, patternsList);
        System.out.println("*****************************");
        getSearch(2);
        searchable.search(inputList, patternsList);
        System.out.println("*****************************");
        getSearch(3);
        searchable.search(inputList, patternsList);

    }

    public static List<String> convertToList(FileReader file) {
        List<String> list = new ArrayList<>();
        Scanner sc;
        try {
            sc = new Scanner(file);
            try {
                while (sc.hasNextLine()) {
                    list.add(sc.nextLine());
                }
            } finally {
                file.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
