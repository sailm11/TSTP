package com.sail;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(reverseNum(5600));
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
