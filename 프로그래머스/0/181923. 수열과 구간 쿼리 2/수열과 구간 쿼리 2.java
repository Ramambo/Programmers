class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length]; // 쿼리 결과를 저장할 배열 초기화
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = Integer.MAX_VALUE; // 초기화 값을 Integer.MAX_VALUE로 설정
            
            for (int j = s; j <= e; j++) {
                // k보다 크거나 같은 값 중 가장 작은 값을 찾는다.
                if (arr[j] > k && arr[j] < min) {
                    min = arr[j]; // 조건에 맞는 최소값 갱신
                }
            }
            
             // 조건에 맞는 값이 없는 경우 -1 저장
            answer[i] = (min == Integer.MAX_VALUE) ? -1 : min;
        }
        
        return answer;
    }
}
