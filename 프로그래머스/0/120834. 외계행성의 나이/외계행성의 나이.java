class Solution {
    public String solution(int age) {
        String answer = "";
        
        while(age > 0){
            int digit = age % 10;
            answer = (char) ('a'+ digit) + answer;
            age /= 10;
        }
        
        return answer;
    }
}