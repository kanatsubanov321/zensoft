package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Factory factory;
    private static List<String> inputList;
    private static List<String> patternsList;

    public static void searching(int byNumber) {
        switch (byNumber) {
            case (1):
                factory = new ExactlyTheSame();
                break;
            case (2):
                factory = new ContainInTheLine();
                break;
            case (3):
                factory = new DistanceEditing();
                break;
            default:
                factory = null;
        }
    }

    public static void main(String[] args) {
        readFromFile();

        System.out.println("First output");
        searching(1);
        factory.getSearchingLines(inputList, patternsList);
        System.out.println();

        System.out.println("Second output");
        searching(2);
        factory.getSearchingLines(inputList, patternsList);
        System.out.println();

        System.out.println("Third output");
        searching(3);
        factory.getSearchingLines(inputList, patternsList);
    }

    public static void readFromFile() {
        FileReader file;
        Scanner sc;
        inputList = new ArrayList<>();
        patternsList = new ArrayList<>();
        try {
            file = new FileReader("input.txt");
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                inputList.add(sc.nextLine());
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            file = new FileReader("patterns.txt");
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                patternsList.add(sc.nextLine());
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
