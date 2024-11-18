class Solution {
    public int solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        
        String answer1 = strA + strB;
        String answer2 = strB + strA;
        
        if (answer1.compareTo(answer2) > 0) {
            return Integer.parseInt(answer1);
        } else {
            return Integer.parseInt(answer2);
        }
    }
}
