package com.dsa.arrays;

public class MoveZerosToRight {

    public static void moveZeros(int[] arr){

        int j = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] != 0){

                int temp = arr[i];

                arr[i] = arr[j];

                arr[j] = temp;

                j++;
            }
        }
    }

    public  static void main(String[] args){
        int[] nums = {1, 0, 2, 0, 3, 0, 4};

        moveZeros(nums);

        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
