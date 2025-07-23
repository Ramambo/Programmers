import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int i=0; i<T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(getLCM(a,b));
        }
        
    }
    
    // 최대공약수
    private static int getGCD(int a, int b){
        while(b !=0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    // 최소공배수
    private static int getLCM(int a, int b){
        return a * b / getGCD(a,b);
    }
}