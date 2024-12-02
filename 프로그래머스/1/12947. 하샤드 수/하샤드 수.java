class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int d = x/1000;
        int c = (x-(d*1000)) / 100;
        int b = (x-(d*1000)-(c*100))/10;
        int a = (x-(d*1000)-(c*100)-(b*10));
        int sum = a+b+c+d;
        
        if(x%sum == 0){
            answer = true;
        }else{
            answer = false; 
        }
        
        
        
        return answer;
    }
}