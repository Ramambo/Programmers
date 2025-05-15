import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String a = sc.nextLine();
            if (a.equals("0")) break;

            int sum = 2; // 좌우 여백 1cm씩
            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
                if (ch == '1') sum += 2;
                else if (ch == '0') sum += 4;
                else sum += 3;

                // 숫자 사이 여백 추가 (마지막 숫자 제외)
                if (i < a.length() - 1) sum += 1;
            }

            System.out.println(sum);
        }
    }
}
