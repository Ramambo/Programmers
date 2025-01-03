class Solution {
    public int[] solution(int[] num_list) {
        int lastNum = num_list.length; // 배열 길이 구하기
        int last = 0; // 배열 안에 추가할 마지막 숫자
        
        if(num_list[lastNum-1] > num_list[lastNum-2]){
            last = num_list[lastNum - 1] - num_list[lastNum - 2];
        }else{
            last = num_list[lastNum-1]*2;
        }
        
        // 결과 배열 생성 (기존 배열 크기 + 1)
        int[] answer = new int[lastNum + 1];
        for(int i=0; i<lastNum; i++){
            answer[i] = num_list[i];
        }
        
        answer[lastNum] = last;
        
        return answer;
    }
}