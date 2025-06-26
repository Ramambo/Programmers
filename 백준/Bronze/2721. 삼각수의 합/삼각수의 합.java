import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i=0; i<T; i++){
            int n = sc.nextInt();
            int result = 0;
            for(int k=1; k<=n; k++){
                int TkPlus1 = (k+1) * (k+2) / 2;
                result += k*TkPlus1;
            }
            System.out.println(result);
        }
    }
}