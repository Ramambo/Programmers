import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            // 공백 n-i개 출력
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            // 별 2*i - 1개 출력
            for(int j = 0; j < 2 * i - 1; j++){
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
        
    }
}
