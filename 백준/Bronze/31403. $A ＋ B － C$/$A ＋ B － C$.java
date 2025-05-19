import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int first = A + B - C;
        System.out.println(first);
        
        // String second = Integer.toString(A) + String.valueOf(B);
        String second = A+""+B;
        int answer = Integer.valueOf(second) - C;
        System.out.println(answer);
        
    }
}