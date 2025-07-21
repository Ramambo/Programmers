public class Solution {
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    private int[] getSlope(int[] p1, int[] p2) {
        int dx = p2[0] - p1[0];
        int dy = p2[1] - p1[1];
        int g = gcd(dx, dy);
        dx /= g;
        dy /= g;

        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }
        return new int[]{dx, dy};
    }

    public int solution(int[][] dots) {
        int[][][] pairs = {
            {{0, 1}, {2, 3}},
            {{0, 2}, {1, 3}},
            {{0, 3}, {1, 2}}
        };

        for (int[][] pair : pairs) {
            int[] s1 = getSlope(dots[pair[0][0]], dots[pair[0][1]]);
            int[] s2 = getSlope(dots[pair[1][0]], dots[pair[1][1]]);
            if (s1[0] == s2[0] && s1[1] == s2[1]) {
                return 1;
            }
        }

        return 0;
    }
}
