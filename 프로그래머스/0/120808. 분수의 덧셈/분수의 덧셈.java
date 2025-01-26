class Solution {
    // 최대공약수(GCD) 함수
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // 최소공배수(LCM) 함수
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 문제 해결 함수
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분모의 최소공배수 계산
        int denomLCM = lcm(denom1, denom2);

        // 통분 후 분자 계산
        int sumNumer = numer1 * (denomLCM / denom1) + numer2 * (denomLCM / denom2);

        // 분자와 분모의 최대공약수를 이용해 약분
        int gcdValue = gcd(sumNumer, denomLCM);
        sumNumer /= gcdValue;       // 약분된 분자
        denomLCM /= gcdValue;      // 약분된 분모

        // 결과 반환
        return new int[] { sumNumer, denomLCM };
    }
}
