package com.kavya;

import java.util.Scanner;
//Using XOR property
public class SingleNumber {
    public static int singleNum(int[] nums){
        int value = 0;
        for(int i = 0; i< nums.length; i++){
            value = value^nums[i];
        }
        return value;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = singleNum(arr);
        System.out.println("Single number is: "+result);
    }
}
