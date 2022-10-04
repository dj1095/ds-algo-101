package edu.uta.dsnalgo.utils;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    private final List<Integer> data;

    private DataGenerator(int size) {
        data = new ArrayList<>(size);
        generateData(size);
    }

    private void generateData(int size) {

        for (int i = 0; i < size; i++) {
            data.add(i);
        }
    }

    public  static DataGenerator createDataGenerator(int size){
        return new DataGenerator(size);
    }

    public List<Integer> getData() {
        return data;
    }
}
