class Solution {
    public int solution(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int mmax = Integer.MIN_VALUE;
        
        for(int num : numbers){
            if(num > max){
                mmax = max; 
                max = num;
            }else if(num > mmax){
                mmax = num;
            }
        }
        return max*mmax;
    }
}