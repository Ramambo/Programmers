class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        for (int num = i; num <= j; num++) {
            String s = String.valueOf(num);
            for (char c : s.toCharArray()) {
                if (c == (char)(k + '0')) {
                    count++;
                }
            }
        }
        return count;
    }
}
