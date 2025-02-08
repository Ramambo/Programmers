import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        // end + 1: end 위치를 포함한 범위에서 자르기
        return Arrays.copyOfRange(num_list, n-1, num_list.length);
    }
}