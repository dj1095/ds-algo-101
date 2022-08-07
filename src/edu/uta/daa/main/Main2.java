package edu.uta.daa.main;

import edu.uta.daa.fibonacci.Fibonacci;
import edu.uta.daa.utils.DataGenerator;

import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        DataGenerator dataGenerator = DataGenerator.createDataGenerator(50);
        List<Integer> data = dataGenerator.getData();
        Fibonacci fibonacci = new Fibonacci();
       // System.out.println(fibonacci.fibTopDown(data));
        System.out.println(fibonacci.fibBottomUp(data));

    }
}
