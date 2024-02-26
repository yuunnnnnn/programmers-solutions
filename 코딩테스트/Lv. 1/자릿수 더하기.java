import java.util.*;

public class Solution {
    public int solution(int n) {
        String strNum = n + "";
        String[] strArr = strNum.split("");
        int answer = 0;
		for (String str : strArr) {
			answer += Integer.parseInt(str);
		}
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12931
