import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                answer.add(numlist[i]);
            }
        }
         // List<Integer> → int[] 로 변환해서 반환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}