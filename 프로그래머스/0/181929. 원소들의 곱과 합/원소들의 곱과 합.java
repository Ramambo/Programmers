class Solution {
    public int solution(int[] num_list) {
        int arrayProduct= 1; // 모든 원소들의 곱
        int sum = 0; // 모든 원소들의 합
        
        for(int i: num_list){
            arrayProduct *= i;
            sum += i;
        }
        
        int productSum =  (int)Math.pow(sum,2); // 모든 원소들의 합의 제곱
        
        if(arrayProduct > productSum){
            return 0;
        }else{
            return 1;
        }
    }
}