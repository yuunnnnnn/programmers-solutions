class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String num = phone_number.substring(length - 4);
        String masking = "*".repeat(length - 4);
        return masking + num;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12948
