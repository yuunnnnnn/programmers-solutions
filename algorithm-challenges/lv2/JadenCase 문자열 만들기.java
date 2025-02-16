class Solution {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        boolean capitalize = true; // 단어의 첫 글자를 대문자로 변환할지 여부
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == ' ') {
                capitalize = true; // 공백이 나오면 다음 문자는 대문자로 변환
            } else {
                if (capitalize) {
                    charArr[i] = Character.toUpperCase(charArr[i]); // 첫 글자는 대문자로
                } else {
                    charArr[i] = Character.toLowerCase(charArr[i]); // 나머지는 소문자로
                }
                capitalize = false;
            }
            answer.append(charArr[i]); // 문자열 누적
        }
        return answer.toString();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12951
