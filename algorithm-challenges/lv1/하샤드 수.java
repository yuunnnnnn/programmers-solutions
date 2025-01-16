class Solution {
    public boolean solution(int x) {
        String[] arr = String.valueOf(x).split("");
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num += Integer.parseInt(arr[i]);
        }
        return x % num == 0;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12947
