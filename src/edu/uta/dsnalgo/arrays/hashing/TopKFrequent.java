package edu.uta.dsnalgo.arrays.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/top-k-frequent-elements/submissions/815207300/
//O(N) Linear Time Solution using modified bucket sort

public class TopKFrequent {

    public static void main(String[] args) {
        int[] nums = {3,0,1,0};
        System.out.println(Arrays.toString(topKFrequent(nums, 1)));
    }
    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int bucketSize = nums.length;
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <bucketSize; i++) {
            buckets.add(new ArrayList<>());
        }

        for(Integer key : map.keySet()){
            List<Integer> list = buckets.get(map.get(key) - 1);
            list.add(key);
        }

        int[] result = new int[k];
        for (int i = buckets.size()-1,kHighest = 0; kHighest < k; i--) {
            for (Integer ele:buckets.get(i)) {
                if(kHighest>=k)
                    break;
                result[kHighest++] = ele;
            }
        }
        return result;
    }
}
