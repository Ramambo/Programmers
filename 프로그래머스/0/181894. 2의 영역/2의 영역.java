class Solution {
    public int[] solution(int[] arr) {
        int firstIndex = -1;
        int lastIndex = -1;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2) {
                if(firstIndex == -1){
                    firstIndex = i;
                }
                else{
                    lastIndex = i;
                }
            }
        }
        if(lastIndex == -1){
            lastIndex = firstIndex;
        }
        if(firstIndex==-1){
            int[] answer = new int[]{-1};
            return answer;
        }
        
        int[] answer = new int[lastIndex-firstIndex+1];
        
        for(int i=0, j=firstIndex; j<=lastIndex; i++,j++){
            answer[i] = arr[j];
        }

        return answer;
    }
}