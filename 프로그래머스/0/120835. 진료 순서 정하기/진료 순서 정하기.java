import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        
        int[] answer = new int[emergency.length];
        
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(emergency[i] == sorted[j]){
                    answer[i] = emergency.length - j;
                    break;
                }
            }
        }
        return answer;
    }
}