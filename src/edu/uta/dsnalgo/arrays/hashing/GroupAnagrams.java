package edu.uta.dsnalgo.arrays.hashing;

//https://leetcode.com/problems/group-anagrams/

/*Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (String input : strs) {
            char[] inputarr = input.toCharArray();
            Arrays.sort(inputarr);
            String sortedInput = new String(inputarr);
            List<String> list = map.getOrDefault(sortedInput, new ArrayList<String>());
            list.add(input);
            map.put(sortedInput, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
