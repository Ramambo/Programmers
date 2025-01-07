import java.util.ArrayList;

class Solution {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for(int i=start_num; i<=end_num; i++){
            numbers.add(i);
        }
        
        //ArrayList를 배열로 변환
        int[] result = new int[numbers.size()];
        for(int i=0; i<numbers.size(); i++){
            result[i] = numbers.get(i);
        }
        return result;
    }
}