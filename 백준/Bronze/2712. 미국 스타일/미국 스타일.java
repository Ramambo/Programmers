import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine()); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            double num = sc.nextDouble(); // 수치 입력
            String unit = sc.next();      // 단위 입력 (kg, lb, l, g)

            double result = 0.0;
            String resultUnit = "";

            switch (unit) {
                case "kg":
                    result = num * 2.2046;
                    resultUnit = "lb";
                    break;
                case "lb":
                    result = num * 0.4536;
                    resultUnit = "kg";
                    break;
                case "l":
                    result = num * 0.2642;
                    resultUnit = "g";
                    break;
                case "g":
                    result = num * 3.7854;
                    resultUnit = "l";
                    break;
            }

            System.out.printf("%.4f %s\n", result, resultUnit);
        }

    }
}
