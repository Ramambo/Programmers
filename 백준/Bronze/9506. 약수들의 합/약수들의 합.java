import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }

            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    arr.add(i);
                }
            }

            int sum = 0;
            for (int i : arr) {
                sum += i;
            }

            if (sum == num) {
                System.out.print(num + " = " + arr.get(0));
                for (int i = 1; i < arr.size(); i++) {  
                    System.out.print(" + " + arr.get(i));
                }
                System.out.println();
            } else {
                System.out.println(num + " is NOT perfect.");
            }
        }
    }
}
