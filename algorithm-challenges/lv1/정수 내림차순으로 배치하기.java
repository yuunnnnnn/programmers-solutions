import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        return Long.parseLong(String.join("", arr));
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12933
