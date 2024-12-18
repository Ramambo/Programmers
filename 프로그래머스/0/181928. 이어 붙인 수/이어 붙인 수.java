class Solution {
    public int solution(int[] num_list) {
        String oddNum="";
        String evenNum="";
        
        for(int i : num_list){
            if(i%2 == 0){
                evenNum += i;
            }else{
                oddNum += i;
            }
        }
        
        int sum = Integer.parseInt(evenNum)  + Integer.parseInt(oddNum);
        return sum;
        
        
    }
}