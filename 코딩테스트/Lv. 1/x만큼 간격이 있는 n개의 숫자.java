class Solution {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		for (int i = 0, j = 1; i < n; i++) {
			answer[i] = (long)x * j;
			j++;
		}
		return answer;
	}
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12954
