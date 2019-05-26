package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Searchable searchable;

    public static void main(String[] args) throws Exception {
        FileReader inputReader = new FileReader("input.txt");
        FileReader patternsReader = new FileReader("patterns.txt");

        List<String> inputList = convertToList(inputReader);
        List<String> patternsList = convertToList(patternsReader);

        searchable = Factory.getSearch("first");
        searchable.search(inputList, patternsList);
        System.out.println("*****************************");
        searchable = Factory.getSearch("second");
        searchable.search(inputList, patternsList);
        System.out.println("*****************************");
        searchable = Factory.getSearch("third");
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
