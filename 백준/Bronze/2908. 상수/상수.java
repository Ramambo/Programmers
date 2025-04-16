import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        //a를 문자열로 변환 후 뒤집기
        String reversed = new StringBuilder(String.valueOf(a)).reverse().toString();
        // 뒤집은 a를 다시 정수로 변환
        int A = Integer.parseInt(reversed);
        
        String reverse = new StringBuilder(String.valueOf(b)).reverse().toString();
        int B = Integer.parseInt(reverse);
        
        if(A > B){
            System.out.println(A);
        }else{
            System.out.println(B);
        }
    }
}