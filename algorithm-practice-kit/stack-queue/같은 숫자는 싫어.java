import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]); // 첫 번째 원소는 무조건 추가

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { // 이전 원소와 다를 때만 추가
                list.add(arr[i]);
            }
        }

        // List를 int 배열로 변환
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12906
