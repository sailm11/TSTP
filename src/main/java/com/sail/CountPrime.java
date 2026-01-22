package com.sail;

public class CountPrime {
    public static void main(String[] args) {
        System.out.println(countPrimes(6));
    }

    private static int countPrimes(int n) {
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (Helper.helper(i))
                cnt++;
        }
        return cnt;

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
