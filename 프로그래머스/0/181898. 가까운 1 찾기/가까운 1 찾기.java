class Solution {
    public int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) { // idx부터 검사하도록 수정
            if (arr[i] == 1) {
                return i; // 1을 찾으면 즉시 반환
            }
        }
        return -1; // 끝까지 찾지 못하면 -1 반환
    }
}
