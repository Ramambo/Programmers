import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long total = 0;
        
        for(int i=0; i<=N; i++){
            for(int j=i; j<=N; j++){
                total += i+j; // 점수 합
            }
        }
        
        System.out.println(total);
    }
}