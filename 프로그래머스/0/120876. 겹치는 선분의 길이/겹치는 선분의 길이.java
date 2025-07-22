class Solution {
    public int solution(int[][] lines) {
        int[] points = new int[201]; // 좌표 -100~100 => 인덱스 0~200

        for (int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;

            for (int i = start; i < end; i++) {
                points[i]++;
            }
        }

        int overlap = 0;
        for (int count : points) {
            if (count >= 2) {
                overlap++;
            }
        }

        return overlap;
    }
}
