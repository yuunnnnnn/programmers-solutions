class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        
        int[] arr = new int[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        
        int min = arr[0];
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }             
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return min + " " + max;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12939
