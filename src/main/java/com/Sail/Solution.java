package com.Sail;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        System.out.println("--------------------------");
        System.out.println("User - Input : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // System.out.println(countPrimes(n));
        System.out.println(reverseNum(n));
        scan.close();
    }

    private static int countPrimes(int n) {
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (Helper.helper(i))
                cnt++;
        }
        return cnt;

    }

    private static int reverseNum(int n) {
        String nums = "";
        while (n > 0) {
            nums += n % 10;
            n /= 10;
        }
        try {
            if (Integer.MAX_VALUE > Integer.parseInt(nums))
                return Integer.parseInt(nums);
        } catch (NumberFormatException e) {
            return 0;
        }
        return 0;
    }
}

class Helper {
    static boolean helper(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}