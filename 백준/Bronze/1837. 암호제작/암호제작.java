import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // P는 매우 큰 수이므로 BigInteger 사용
        BigInteger P = new BigInteger(sc.next());
        int K = sc.nextInt();

        // 2부터 K-1까지 소수인지 확인
        boolean[] isPrime = new boolean[K];
        for (int i = 2; i < K; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < K; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < K; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 소수로 나누어 떨어지는지 확인
        for (int i = 2; i < K; i++) {
            if (isPrime[i]) {
                if (P.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                    System.out.println("BAD " + i);
                    return;
                }
            }
        }

        System.out.println("GOOD");
    }
}
