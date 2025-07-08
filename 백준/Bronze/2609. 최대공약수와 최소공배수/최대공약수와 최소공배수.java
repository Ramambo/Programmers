import java.util.Scanner;

public class Main{
    // 유클리드 호제법으로 최대공약수 구하기
    public static int gcd(int a, int b){
        while(b !=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int gcd = gcd(a,b); // 최대공약수
        int lcm = (a * b) / gcd; // 최소공배수
        
        System.out.println(gcd);
        System.out.println(lcm);
    }
}