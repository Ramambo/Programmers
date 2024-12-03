class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        
        // 둘 중 하나 아무거나 실수형으로 바꿔도 된다.
        answer = (num1 / (double)num2) * 1000;
        
        return (int)answer;
    }
}