import java.util.*; 

class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = s.split(" ");
        
        for(String token : tokens){
            if(token.equals("Z")){
                if(!stack.isEmpty()){
                    stack.pop(); // 마지막 숫자 취소하기
                }
            }else{
                    stack.push(Integer.parseInt(token)); // 숫자 저장
            
            }
        }
        int sum = 0;
        for(int num : stack){
            sum += num;
        }
        
        return sum;
        
    }
}