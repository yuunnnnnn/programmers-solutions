import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A); // A 오름차순 정렬
        Arrays.sort(B); // B 오름차순 정렬
        
        int sum = 0;
        int n = A.length;
        
        for (int i = 0; i < n; i++) {
            sum += A[n - 1 - i] * B[i]; // A의 큰 값과 B의 작은 값을 곱함
        }
        return sum;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12941
