package com.sail;

public class ThirdGreatestNum {
    public static void main(String[] args) {
        System.out.println(thirdGreatestNum(new int[] { 5, 6, 5, 5 }));
    }

    private static int thirdGreatestNum(int arr[]) {
        int largest = -1;
        int secondLargest = -1;
        int thirdLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == largest || arr[i] == secondLargest || arr[i] == thirdLargest) {
                continue;
            }
            if (arr[i] > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if (arr[i] > thirdLargest) {

                thirdLargest = arr[i];
            }
        }
        if (thirdLargest == -1)
            return largest;
        return thirdLargest;
    }
}
