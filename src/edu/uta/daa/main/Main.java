package edu.uta.daa.main;

import edu.uta.daa.sorting.quickSort.RandomizedQuickSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,6,8,23,14,67,90,22);
        RandomizedQuickSort sort = new RandomizedQuickSort();
        sort.randomizedQSort(list,0,list.size()-1);
        System.out.println(list);
    }
}
