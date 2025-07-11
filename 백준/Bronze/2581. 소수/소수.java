import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        int min = -1;

        for(int i = m; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
                if (min == -1) {
                    min = i; // 첫 번째 소수를 최소값으로 저장
                }
            }
        }

        if (min == -1) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    // 소수 판별 함수
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
