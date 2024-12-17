class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if (eq.equals("=")) {
            if (ineq.equals(">")) return n >= m ? 1 : 0;
            if (ineq.equals("<")) return n <= m ? 1 : 0;
        } else if (eq.equals("!")) {
            if (ineq.equals(">")) return n > m ? 1 : 0;
            if (ineq.equals("<")) return n < m ? 1 : 0;
        }
        return 0;  // 기본 반환값
    }
}