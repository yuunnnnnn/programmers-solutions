class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // arr1의 크기만큼 결과 배열 초기화
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        // 이중 반복문으로 행과 열을 순회하며 각 요소를 더하기
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) { // 열의 개수만큼 반복
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12950
