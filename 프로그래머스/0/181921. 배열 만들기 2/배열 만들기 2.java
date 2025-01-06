import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (isValid(i)) {
                list.add(i);
            }
        }
        
        if (list.isEmpty()) {
            return new int[] { -1 };
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean isValid(int num){
        while (num>0){
            int digit = num%10;
            if(digit != 0 && digit !=5){
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
