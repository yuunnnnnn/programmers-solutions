class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        return sqrt % 1 == 0 ? (long) Math.pow(sqrt + 1, 2) : -1;
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12934
