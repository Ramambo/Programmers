import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        double minPrice = ((double) X / Y) * 1000;

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            double cost = ((double) x / y) * 1000;
            if(cost < minPrice){
                minPrice = cost;
            }
        }
        System.out.printf("%.2f\n", minPrice);
    }
}
