package edu.uta.dsnalgo.arrays.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // O(n) Time Complexity
    // O(n) Space Complexity

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{78, 7, 2, 15}, 9)));
    }


    private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(target - nums[i]) !=null){
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }
}
