package com.dsa.arrays;

public class MoveZerosToLeft {

    public static void moveZeros(int[] nums){

        int j = nums.length - 1;

        for(int i = nums.length -1; i >= 0; i--){

            if(nums[i] != 0){

                int temp = nums[i];

                nums[i] = nums[j];

                nums[j] = temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, 2, 0, 3, 0, 4};

        moveZeros(nums);

        for(int num : nums){

            System.out.print(num + " ");
        }
    }
}
