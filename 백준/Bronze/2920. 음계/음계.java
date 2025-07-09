import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        boolean isMixed = false;

        if (m == 1) {
            for (int i = 2; i <= 8; i++) {
                int mm = sc.nextInt();
                if (mm != i) {
                    isMixed = true;
                    break;
                }
            }
            if (isMixed) {
                System.out.println("mixed");
            } else {
                System.out.println("ascending");
            }
        } else if (m == 8) {
            for (int i = 7; i >= 1; i--) {
                int mm = sc.nextInt();
                if (mm != i) {
                    isMixed = true;
                    break;
                }
            }
            if (isMixed) {
                System.out.println("mixed");
            } else {
                System.out.println("descending");
            }
        } else {
            System.out.println("mixed");
        }
    }
}
