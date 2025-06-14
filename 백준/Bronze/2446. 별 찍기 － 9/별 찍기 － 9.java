import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 위쪽별 (N줄)
        for (int i = 0; i < N; i++) {
            // 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < 2 * (N - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 별 (N-1줄)
        for (int i = 1; i < N; i++) {
            // 공백 출력
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
