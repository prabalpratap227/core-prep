package com.blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 5, 7};

        int target = 9;

        System.out.println("Brute force approach");
        System.out.println( Arrays.toString(bruteForce(nums, target)));

        System.out.println();

        System.out.println("Optimal approach");
        System.out.println(Arrays.toString(bruteForce(nums, target)));
    }

    public static int[] bruteForce(int[] nums, int target){

        for(int i = 0; i < nums.length;i++){

            for(int j = 1; j < nums.length; j++){

                if(nums[i] + nums[j] == target){

                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static int[] optimalApproach(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int compliment = target - nums[i];

            if(map.containsKey(compliment)){

                return new int[]{map.get(compliment), i};
            }
        }

        return new int[]{};
    }
}
