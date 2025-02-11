import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;
        for (int i = 0; i < d.length; i++) {
            if (budget < d[i]) {
                break;
            }
            budget -= d[i];
            count++;
        }
        return count;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12982