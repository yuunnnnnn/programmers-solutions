class Solution {
    public int solution(int[] numbers) {
        int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;
        int num = 0;
        for (int i = 0; i < numbers.length; i++) {
            num += numbers[i];
        }
        return sum - num;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/86051
