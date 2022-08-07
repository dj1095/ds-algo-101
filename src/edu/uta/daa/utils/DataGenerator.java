package edu.uta.daa.utils;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    private List<Integer> data;

    private DataGenerator(int size) {
        data = new ArrayList<>(size);
        generateData(size);
    }

    private List<Integer> generateData(int size) {

        for (int i = 0; i < size; i++) {
            data.add(i);
        }
        return data;
    }

    public  static DataGenerator createDataGenerator(int size){
        return new DataGenerator(size);
    }

    public List<Integer> getData() {
        return data;
    }
}
