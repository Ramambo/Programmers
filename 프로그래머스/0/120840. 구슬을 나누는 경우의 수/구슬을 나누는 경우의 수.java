import java.math.BigInteger;

class Solution {
    public long solution(int balls, int share) {
        return combination(balls, share).longValue();
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static BigInteger combination(int balls, int share) {
        return factorial(balls)
                .divide(factorial(share).multiply(factorial(balls - share)));
    }
}
