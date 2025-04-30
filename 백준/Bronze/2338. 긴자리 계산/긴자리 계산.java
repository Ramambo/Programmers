import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         // BigInteger로 A와 B 입력 받기
        BigInteger A = new BigInteger(sc.nextLine());
        BigInteger B = new BigInteger(sc.nextLine());

        // A+B, A-B, A*B 출력
        System.out.println(A.add(B));   // A + B
        System.out.println(A.subtract(B));  // A - B
        System.out.println(A.multiply(B));  // A * B
    }
}
