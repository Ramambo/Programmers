import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[10];
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int result = A * B * C;
        String str = String.valueOf(result);
        
        for(int i=0; i<str.length(); i++){
            int digit = str.charAt(i) - '0'; // 문자 -> 숫자
            num[digit]++;
        }
        
        for(int i=0; i<10; i++){
            System.out.println(num[i]);
        }
        
    }
}