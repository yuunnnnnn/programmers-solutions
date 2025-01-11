class Solution {
    public int[] solution(long n) {
        String[] arr = String.valueOf(n).split("");
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[answer.length - 1 - i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12932
