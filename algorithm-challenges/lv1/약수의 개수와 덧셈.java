class Solution {
    public int solution(int left, int right) {
        int total = 0;
        for (int i = left; i <= right; i++) {
            int count = 0; // 약수 개수 초기화
            for (int j = 1; j <= i; j++) { // 1부터 i까지 반복하여 약수 개수 계산
                if (i % j == 0) {
                    count++;
                }
            }
            total += (count % 2 == 0) ? i : -i; // 짝수면 더하고 홀수면 빼기
        }
        return total;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/77884
