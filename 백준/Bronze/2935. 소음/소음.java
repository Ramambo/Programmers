import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = new BigInteger(sc.nextLine());
        String op = sc.nextLine();
        BigInteger B = new BigInteger(sc.nextLine());

        if (op.equals("+")) {
            System.out.println(A.add(B));
        } else if (op.equals("*")) {
            System.out.println(A.multiply(B));
        }
    }
}
