import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < T; i++) {
            String quiz = sc.nextLine();
            int total = 0;
            int count = 0;

            for (int j = 0; j < quiz.length(); j++) {
                if (quiz.charAt(j) == 'O') {
                    count++;
                    total += count;
                } else {
                    count = 0;
                }
            }

            System.out.println(total);
        }
    }
}
