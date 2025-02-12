class Solution {
    public long solution(int price, int money, int count) {
        long cost = 0; // long 자료형 사용하여 오버플로우 방지
        for (int i = 1; i <= count; i++) {
            cost += (long) price * i; // 연산 중 오버플로우 방지
        }
        return Math.max(cost - money, 0); // 부족한 금액이 없으면 0 반환
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/82612
