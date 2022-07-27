package edu.uta.daa.main;

import edu.uta.daa.sorting.quickSort.RandomizedQuickSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final int LIST_SIZE = 30000000;

    public static void main(String[] args) {
        RandomizedQuickSort sort = new RandomizedQuickSort();
        List<Integer> list = generateRandomData(LIST_SIZE);
        long startTime = System.currentTimeMillis();
        sort.randomizedQSort(list, 0, list.size() - 1);
        long endTime = System.currentTimeMillis();
        long milliseconds = endTime - startTime;
        long minutes = (milliseconds / 1000) / 60;
        long seconds = (milliseconds / 1000) % 60;
        System.out.println(milliseconds + " Milliseconds = "
                + minutes + " minutes and "
                + seconds + " seconds.");

        List<Integer> sortedInput = generateSortedData(LIST_SIZE);
        long startTime2 = System.currentTimeMillis();
        sort.randomizedQSort(sortedInput, 0, sortedInput.size() - 1);
        long endTime2 = System.currentTimeMillis();
        long milliseconds2 = endTime2 - startTime2;
        long minutes2 = (milliseconds2 / 1000) / 60;
        long seconds2 = (milliseconds2 / 1000) % 60;
        System.out.println(milliseconds2 + " Milliseconds = "
                + minutes2 + " minutes and "
                + seconds2 + " seconds.");
        //System.out.println(list);
        List<Integer> reverseSortedInput = generateReverseSortedData(LIST_SIZE);
        long startTime3 = System.currentTimeMillis();
        sort.randomizedQSort(reverseSortedInput, 0, reverseSortedInput.size() - 1);
        long endTime3 = System.currentTimeMillis();
        long milliseconds3 = endTime3 - startTime3;
        long minutes3 = (milliseconds3 / 1000) / 60;
        long seconds3 = (milliseconds3 / 1000) % 60;
        System.out.println(milliseconds3 + " Milliseconds = "
                + minutes3 + " minutes and "
                + seconds3 + " seconds.");
        //System.out.println(reverseSortedInput);
    }

    private static List<Integer> generateSortedData(int size) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return list;
    }

    private static List<Integer> generateRandomData(int size) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }
        return list;
    }

    private static List<Integer> generateReverseSortedData(int size) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = size - 1; i >= 0; i--) {
            list.add(i);
        }
        return list;
    }

}
