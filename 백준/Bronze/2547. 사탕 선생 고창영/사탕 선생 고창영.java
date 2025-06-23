import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine()); // 테스트 케이스 개수
        sc.nextLine(); // 첫 번째 빈 줄 건너뛰기

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(sc.nextLine());
            BigInteger sum = BigInteger.ZERO;

            for (int i = 0; i < N; i++) {
                BigInteger candy = new BigInteger(sc.nextLine());
                sum = sum.add(candy);
            }

            // sum % N == 0 이면 YES, 아니면 NO
            if (sum.mod(BigInteger.valueOf(N)).equals(BigInteger.ZERO)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            // 마지막 테스트케이스가 아니라면 다음 빈 줄을 넘김
            if (t != T - 1 && sc.hasNextLine()) {
                sc.nextLine(); // 빈 줄 건너뛰기
            }
        }
        sc.close();
    }
}
