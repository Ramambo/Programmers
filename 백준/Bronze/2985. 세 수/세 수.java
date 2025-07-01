import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A + B == C) {
            System.out.println(A + "+" + B + "=" + C);
        } else if (A - B == C) {
            System.out.println(A + "-" + B + "=" + C);
        } else if (A * B == C) {
            System.out.println(A + "*" + B + "=" + C);
        } else if (B != 0 && A % B == 0 && A / B == C) {
            System.out.println(A + "/" + B + "=" + C);
        } else if (B + C == A) {
            System.out.println(A + "=" + B + "+" + C);
        } else if (B - C == A) {
            System.out.println(A + "=" + B + "-" + C);
        } else if (B * C == A) {
            System.out.println(A + "=" + B + "*" + C);
        } else if (C != 0 && B % C == 0 && B / C == A) {
            System.out.println(A + "=" + B + "/" + C);
        }
    }
}