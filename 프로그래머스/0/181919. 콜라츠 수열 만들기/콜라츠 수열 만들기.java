class Solution {
    public int[] solution(int n) {
        int[] answer = new int[1000];
        int i=0;
        
        //첫번째 값 추가
        answer[i++] = n;
        
        //콜라츠 추측 계산
        while(n!=1){
            if(n % 2 == 0){ //짝수
                n /= 2;
            } else { // 홀수
                n = 3 * n + 1;
            }
            answer[i++] = n; //계산된 값 저장
        }
        
        // 결과 배열의 크기를 맞추기 위해 복사
        int[] result = new int[i];
        for (int j = 0; j < i; j++) {
            result[j] = answer[j];
        }

        return result;
    }
}