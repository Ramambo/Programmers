import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();
            if (line.equals("#")) break;

            int count = 0;
            line = line.toLowerCase();

            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if ("aeiou".indexOf(ch) != -1) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
