class Solution {
    public int solution(int[] array, int n) {
        int minDiff = 100; // n과의 최소 거리
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            int diff = Math.abs(n - array[i]); // 거리 계산
            if (diff < minDiff) {
                minDiff = diff;
                answer = array[i];
            } else if (diff == minDiff) {
                // 거리가 같을 경우 더 작은 수 선택
                if (array[i] < answer) {
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}
