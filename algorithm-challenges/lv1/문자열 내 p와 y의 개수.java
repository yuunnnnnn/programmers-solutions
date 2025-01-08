class Solution {
    boolean solution(String s) {
        String[] arr = s.split("");
        int p = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase("P")) {
                p++;
            }
            if (arr[i].equalsIgnoreCase("Y")) {
                y++;
            }
        }
        return p == y;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12916
