package edu.uta.daa.approaches;
//https://leetcode.com/problems/jump-game/description/
// Valley Jump Approach
//Time Complexity - O(n)
//space Complexity - O(1)
/*55. Jump Game
        Medium
        You are given an integer array nums. You are initially positioned at the array's first index,
        and each element in the array represents your maximum jump length at that position.
        Return true if you can reach the last index, or false otherwise.

        Example 1:
        Input: nums = [2,3,1,1,4]
        Output: true
        Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

        Example 2:
        Input: nums = [3,2,1,0,4]
        Output: false
        Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

        Constraints:
        1 <= nums.length <= 104
        0 <= nums[i] <= 105*/

import java.util.Arrays;

public class KJumpApproach {

    public static void main(String[] args) {
        int [] nums = {2,3,1,1,4};
        int[] nums2 = {3,2,1,0,4};
        System.out.println("Can we jump to the other end of the array?: "+ Arrays.toString(nums) +(canJump(nums)?"\nYes,we Can\uD83D\uDE00":"\nNo,We cannot ☹"));
        System.out.println("Can we jump to the other end of the array?: "+Arrays.toString(nums2)+(canJump(nums2)?"\nYes,we Can\uD83D\uDE00":"\nNo,We cannot ☹"));
    }

    private static   boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i =0; i<nums.length;i++){
            if( i > reachable)
                return false;
            if(i + nums[i] > reachable)
                reachable = i + nums[i];
            if( reachable >= nums.length -1)
                return true;
        }
        return false;
    }
}
