import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger K = new BigInteger(sc.next()); // 10^100까지 들어오니까 BigInteger 사용
        int L = sc.nextInt();

        for (int i = 2; i < L; i++) {
            if (K.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                // i가 K를 나누어 떨어지면 BAD
                System.out.println("BAD " + i);
                return;
            }
        }

        // 끝까지 나누어떨어지는 수가 없으면 GOOD
        System.out.println("GOOD");
    }
}
