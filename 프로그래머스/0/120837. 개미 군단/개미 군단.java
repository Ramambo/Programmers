class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(true){
            if(hp == 0){
                break;
            }else if(hp >= 5){
                int num = hp/5;
                answer += num;
                hp -= num * 5;
            }else if(hp >= 3){
                int num3 = hp / 3;
                answer += num3;
                hp -= num3 * 3;
            }else{
                answer += hp;
                hp = 0;
            }
        }
        
        return answer;
    }
}