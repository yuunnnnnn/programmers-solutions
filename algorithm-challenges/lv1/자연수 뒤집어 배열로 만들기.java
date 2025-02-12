class Solution {
    public int[] solution(long n) {
        String str = new StringBuilder(String.valueOf(n)).reverse().toString(); // 숫자를 뒤집음
        int[] answer = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(i) - '0'; // 문자 -> 숫자 변환
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12932
