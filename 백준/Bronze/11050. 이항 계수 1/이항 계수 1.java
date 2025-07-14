import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int kp = 1;
        for(int i=K; i>0; i--){
            kp *= i;
        }
        
        int knp = 1;
        for(int i=N-K; i>0; i--){
            knp *= i;
        }
        
        int np = 1;
        for(int i=N; i>0; i--){
            np *= i;
        }
        
        int answer = np / (kp * knp);
        
        System.out.println(answer);
    }
}