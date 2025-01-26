class Solution {
    public String solution(String s) {
        int length = s.length();
        int mid = length / 2;
        return (length % 2 == 0) ? s.substring(mid - 1, mid + 1) : s.substring(mid, mid + 1);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12903
