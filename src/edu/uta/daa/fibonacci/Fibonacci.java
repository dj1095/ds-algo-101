package edu.uta.daa.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    // Exponential Time Complexity 0(2^n)
    public List<Long> fibTopDown(List<Integer> numbers){
        List<Long> list = new ArrayList<>(numbers.size());
        numbers.forEach(number -> list.add(fibTopDown(number)));
        return list;
    }

    public long fibTopDown(long number){
        if(number == 0)
            return 0;
        else if (number <= 2)
            return 1;
        return fibTopDown(number-1) + fibTopDown(number-2);
    }

    // Linear Time Complexity 0(n)
    public List<Long> fibBottomUp(List<Integer> numbers){
        List<Long> list = new ArrayList<>(numbers.size());
        numbers.forEach(number -> list.add(fibBottomUp(number)));
        return list;
    }

    public long fibBottomUp(long number){
        if(number == 0)
            return 0;
        else if (number <= 2)
            return 1;
        long last = 1;
        long lastBefore = 1;
        for(int i =3; i<=number;i++){
            long temp = lastBefore;
            lastBefore = last ;
            last = temp + last;
        }
        return last;
    }
}
