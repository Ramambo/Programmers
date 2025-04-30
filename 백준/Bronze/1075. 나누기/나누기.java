import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt() / 100 * 100;
        int f = sc.nextInt();
        
        int newn = n;
        
        while(newn % f !=0){
            newn++;
        }
        
        int answer = newn - n;
        System.out.printf("%02d", answer); // 두 자리로 출력
    }
}