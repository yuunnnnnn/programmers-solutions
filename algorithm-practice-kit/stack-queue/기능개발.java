import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] work = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            work[i] = 100 - progresses[i];
        }

        int[] day = new int[progresses.length];
        for (int i = 0; i < speeds.length; i++) {
            day[i] = (int) Math.ceil((double) work[i] / speeds[i]);
        }

        List<Integer> list = new ArrayList<>();

        int count = 1; 
        int maxDay = day[0];
        
        for (int i = 1; i < speeds.length; i++) {
            if (day[i] <= maxDay) {
                count++;
            } else {
                list.add(count);
                count = 1;
                maxDay = day[i];
            }
        }
        list.add(count);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/42586
