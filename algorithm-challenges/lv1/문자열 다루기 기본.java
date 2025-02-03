class Solution {
    public boolean solution(String s) {
        return (s.length() == 4 || s.length() == 6) && s.matches("^[0-9]+$");
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12918
