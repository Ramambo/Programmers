import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();  // 컵 위치를 바꾼 횟수
        int[] cups = {0, 1, 0, 0};  // 인덱스 1부터 시작, 공은 처음에 1번 컵 아래

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            // 컵 위치를 바꿉니다
            int temp = cups[x];
            cups[x] = cups[y];
            cups[y] = temp;
        }

        // 공이 있는 컵의 번호 찾기
        int result = -1;
        for (int i = 1; i <= 3; i++) {
            if (cups[i] == 1) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
