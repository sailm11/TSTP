package com.kavya;

import java.util.Scanner;
//Using Moore's vote Algorithm
public class MajorityElement {

    public static int majorityElement(int[] nums ){
        int candidate = 0;
        int count = 0;

        for(int num: nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }else {
                count--;
            }
        }
        return candidate;
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int result = majorityElement(nums);
        System.out.println("Majority element of this array is: " + result);

    }
}
