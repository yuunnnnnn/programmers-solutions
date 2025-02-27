class Solution {
    public int solution(int num) {
        long n = num;
        int answer = 0;
        while (1 < n) {
            if (answer == 500) {
                return -1;
            }
            n = (n % 2 == 0) ? n / 2 : (n * 3) + 1;
            answer++;
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12943
