class Solution {
    public int solution(int[] num_list) {
        int arrayProduct= 1; // 모든 원소들의 곱
        int sum = 0; // 모든 원소들의 합
        
        for(int i: num_list){
            arrayProduct *= i;
            sum += i;
        }
        int answer = Math.pow(sum,2) > arrayProduct ? 1:0;
        
        return answer;
        
    }
}
