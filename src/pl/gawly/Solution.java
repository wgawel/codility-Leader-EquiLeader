package pl.gawly;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {
        int result = 0;
        // leader must be leader of all sequence
        int value = -1000000007;
        int size = 0;
        for (int i = 0; i < A.length; i++) {
            if (size == 0) {
                size++;
                value = A[i];
            } else {
                if (A[i] != value) {
                    size--;
                } else {
                    size++;
                }
            }
        }
        int candidate = -1000000003;
        if (size > 0) {
            candidate = value;
        }
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                count++;
            }
        }
        int leader = -1000000002;
        if (A.length - count < count) {
            leader = candidate;
        }

        int leaderCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) {
                leaderCount++;
            }
            int leaderInRightPart = count - leaderCount;
            if (leaderCount > (i+1)/2 && leaderInRightPart > (A.length-i-1)/2) {
                result++;
            }
        }
        return result;
    }
}
