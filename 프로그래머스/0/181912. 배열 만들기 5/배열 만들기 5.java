import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        
        for(String numStr : intStrs){
            int part = Integer.parseInt(numStr.substring(s, s + l)); // s부터 s+l길이만큼 자른다.
            if(part > k){
                result.add(part);
            }
        }
        return result.stream().mapToInt(i -> i).toArray(); // Listf를 배열로 변환
    }
}