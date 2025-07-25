import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];

        double[][] avg = new double[n][2];
        for (int i = 0; i < n; i++) {
            avg[i][0] = (score[i][0] + score[i][1]) / 2.0;
            avg[i][1] = i;
        }

        Arrays.sort(avg, (a, b) -> Double.compare(b[0], a[0]));

        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && avg[i][0] < avg[i - 1][0]) {
                rank = i + 1;
            }
            int index = (int) avg[i][1];
            answer[index] = rank;
        }

        return answer;
    }
}
