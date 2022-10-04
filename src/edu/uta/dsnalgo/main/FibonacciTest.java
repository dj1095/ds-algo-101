package edu.uta.dsnalgo.main;

import edu.uta.dsnalgo.fibonacci.Fibonacci;
import edu.uta.dsnalgo.utils.DataGenerator;

import java.util.List;

public class FibonacciTest {

    public static void main(String[] args) {

        DataGenerator dataGenerator = DataGenerator.createDataGenerator(50);
        List<Integer> data = dataGenerator.getData();
        Fibonacci fibonacci = new Fibonacci();
        // System.out.println(fibonacci.fibTopDown(data));
        System.out.println(fibonacci.fibBottomUp(data));

    }
}
