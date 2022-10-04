package edu.uta.dsnalgo.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrefixScores {

    public static void main(String[] args) {
        System.out.println(getPrefixScores(Arrays.asList(1,2,3)));
    }

    // Not Optimal - can be achieved in O(n)
    private static List<Integer> getPrefixScores(List<Integer> arr) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
        long max = arr.get(0);
        for(int i = 0;i < arr.size();i++){
            long currentMax = max = Math.max(max,arr.get(i));
            long sum = 0;
            for(int j =0; j<=i;j++){
                currentMax = Math.max(currentMax, arr.get(j) + currentMax);
                sum += currentMax;
            }
            int score  = (int) (sum % (Math.pow(10, 9) +7));
            results.add(score);
        }
        return results;
    }

}
