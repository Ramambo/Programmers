class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int num = num2-num1 +1;
        int[] answer = new int [num];
        
        for(int i=0; i<num; i++){
            answer[i] = numbers[num1++];
        }
        return answer;
    }
}