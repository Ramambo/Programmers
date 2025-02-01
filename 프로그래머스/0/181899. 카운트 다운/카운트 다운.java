import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> count = new ArrayList<>(); // 'Arraylist' -> 'ArrayList' 수정

        // start_num에서 end_num까지 1씩 감소하면서 리스트에 추가
        for (int i = start_num; i >= end_num; i--) {
            count.add(i);
        }
        
        // List<Integer>를 int[]로 변환
        int[] answer = new int[count.size()];
        for (int i = 0; i < count.size(); i++) {
            answer[i] = count.get(i);
        }
        
        return answer;
    }
}
