class Solution {
    public int solution(int num, int k) {
        String sNum = String.valueOf(num);
        
        for (int i = 0; i < sNum.length(); i++) {
            if (sNum.charAt(i) - '0' == k) {
                return i + 1; 
            }
        }
        
        return -1; // 못 찾았을 경우
    }
}
