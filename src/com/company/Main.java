package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> inputList;
    private static List<String> patternsList;

    public static void main(String[] args) throws Exception {
        FileReader inputReader = new FileReader("input.txt");
        FileReader patternsReader = new FileReader("patterns.txt");

        inputList = readFromFile(inputReader);
        patternsList = readFromFile(patternsReader);

        Factory.getSearch(new ExactlyTheSame(), inputList, patternsList);
        Factory.getSearch(new ContainInTheLine(), inputList, patternsList);
        Factory.getSearch(new DistanceEditing(), inputList, patternsList);
    }

    public static List<String> readFromFile(FileReader file) {
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
