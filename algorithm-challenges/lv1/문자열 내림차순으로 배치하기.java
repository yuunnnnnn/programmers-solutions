import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr); // 오름차순 정렬 후
        StringBuilder sb = new StringBuilder(new String(arr)); 
        return sb.reverse().toString(); // 뒤집어서 내림차순 정렬
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12917
