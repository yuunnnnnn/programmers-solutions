class Solution {
    public double solution(int[] arr) {
        double num = 0;
        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
        }
        return num / arr.length;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12944
