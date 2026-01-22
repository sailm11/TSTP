package com.sail;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] { 1, 5, 3, 1, 3 }));
    }

    private static int singleNumber(int arr[]) {
        int num = 0;
        for (int n : arr) {
            num ^= n;
        }

        return num;
    }
}
