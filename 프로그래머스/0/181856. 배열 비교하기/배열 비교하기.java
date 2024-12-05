class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sumArr1 = 0;
        int sumArr2 = 0;
        
        // 두 배열의 길이가 같은 경우
        if (arr1.length == arr2.length){
            //두 배열의 요소 합 계산
            for(int i = 0; i < arr1.length; i++){
                sumArr1 += arr1[i];
                sumArr2 += arr2[i];
            }
            
            // 합을 비교하여 결과 반환
            if (sumArr1 > sumArr2) {
                return 1;
            } else if (sumArr1 < sumArr2) {
                return -1;
            } else {
                return 0;
            }
        }
            
        // 두 배열의 길이가 다른 경우
        return arr1.length > arr2.length ? 1 : -1;
        
        
    }
}