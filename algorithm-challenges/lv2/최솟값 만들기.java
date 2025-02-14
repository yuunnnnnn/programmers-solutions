import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        int sum = 0;
        int n = A.length;
        
        for (int i = 0; i < n; i++) {
            sum += A[n - 1 - i] * B[i];
        }
        return sum;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12941
