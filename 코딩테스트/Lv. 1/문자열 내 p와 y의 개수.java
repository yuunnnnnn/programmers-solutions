class Solution {
	boolean solution(String s) {
		String[] strArr = s.toUpperCase().split("");
		int p = 0;
		int y = 0;
		for (String str : strArr) {
			if ("P".equals(str)) {
				p++;
			}
			if ("Y".equals(str)) {
				y++;
			}
		}
		return p == y;
	}
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12916
