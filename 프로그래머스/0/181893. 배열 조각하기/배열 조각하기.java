import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();
        for(int num : arr){
            answer.add(num);
        }
        
        for(int i=0; i<query.length; i++){
            if(i%2 == 0){ // i번 인덱스 이후(i번부터 끝까지) 삭제
                answer.subList(query[i]+1, answer.size()).clear();
            } else{
                answer.subList(0,query[i]).clear();
            }
        }
        
        // 리스트를 int 배열로 변환
        int[] sun = answer.stream().mapToInt(i -> i).toArray();
        
        return sun;
    }
}