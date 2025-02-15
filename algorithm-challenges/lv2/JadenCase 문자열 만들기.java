class Solution {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        String answer = "";
        
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != ' ') {
                charArr[i] = Character.toLowerCase(charArr[i]);
            }
            if (i > 0 && charArr[i - 1] == ' ') {
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
            charArr[0] = Character.toUpperCase(charArr[0]);
            answer += charArr[i];
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12951
