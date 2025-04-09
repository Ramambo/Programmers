class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i=0; i<100; i++){
            if(answer * 7 / n >=1){
                break;
            }
            answer++;
        }
        return answer;
    }
}