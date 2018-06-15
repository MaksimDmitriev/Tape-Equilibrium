package com.app;

public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        for (int elem : A) {
            sum += elem;
        }
        // given a non-empty array A of N integers, returns the minimal difference that can be achieved.
        int minDiff = Integer.MAX_VALUE;
        int left;
        int right = 0;
        for (int i = A.length - 1; i >= 1; i--) {
            right += A[i];
            left = sum - right;
            int diff = Math.abs(left - right);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
