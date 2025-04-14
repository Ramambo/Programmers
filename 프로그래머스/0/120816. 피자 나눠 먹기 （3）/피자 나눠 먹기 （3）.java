class Solution {
    public int solution(int slice, int n) {
        int a = 1;
        
        while(true){
            if(slice * a >= n){
                return a;
            }
            a++;
        }
    }
}