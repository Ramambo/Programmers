import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int I = sc.nextInt();
        
        int answer = (I - 1) * A + 1;
        
        System.out.println(answer);
    }
}