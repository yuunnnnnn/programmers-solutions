import java.util.*;

class Solution {
    public String solution(String s) {
        Character[] charArr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArr[i] = s.charAt(i);
        }
        
        Arrays.sort(charArr, Collections.reverseOrder());
        
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLowerCase(charArr[i])) {
                list.add(charArr[i]);
            }
        }
        
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isUpperCase(charArr[i])) {
                list.add(charArr[i]);
            }
        }
        
        char[] chArr = new char[list.size()];
        for (int i = 0; i < list.size(); i++) {
            chArr[i] = list.get(i);
        }
        
        String str = "";
        for (int i = 0; i < chArr.length; i++) {
            str += chArr[i];
        }
        return str;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12917
