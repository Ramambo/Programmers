import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] dp = new int[15][15];
        
        for(int i=1; i<=14; i++){
            dp[0][i] = i;
        }
        
        for(int k = 1; k<=14; k++){
            for(int n = 1; n<=14; n++){
                dp[k][n] = dp[k][n-1] + dp[k-1][n];
            }
        }
        
        int T = sc.nextInt();
        for(int t = 0; t < T; t++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(dp[k][n]);
        }
    }
}