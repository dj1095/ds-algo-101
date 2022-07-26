package edu.uta.daa.sorting.quickSort;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomizedQuickSort {

    private int partition(List<Integer> numbers, int low, int high) {
        int pivot = numbers.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (numbers.get(j) <= pivot) {
                i++;
                Collections.swap(numbers, i, j);
            }
        }
        Collections.swap(numbers, i + 1, high);
        return i + 1;
    }

    private Integer random_partition(List<Integer> numbersList, int low, int high) {
        Random random = new Random();
        int randomIndex = random.nextInt((high - low)) + low;
        Collections.swap(numbersList, randomIndex, high);
        return partition(numbersList, low, high);
    }

    public void randomizedQSort(List<Integer> list, int low, int high) {
        if (low < high) {
            int partitionIndex = random_partition(list, low, high);
            randomizedQSort(list, low, partitionIndex - 1);
            randomizedQSort(list, partitionIndex + 1, high);
        }
    }

}
