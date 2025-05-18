import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            int N = sc.nextInt();
            BigInteger sum = BigInteger.ZERO;
            for(int j = 0; j<N; j++){
                BigInteger num = new BigInteger(sc.next());
                sum = sum.add(num);
            }
            int cmp = sum.compareTo(BigInteger.ZERO);
            if (cmp > 0) {
                System.out.println("+");
            } else if (cmp < 0) {
                System.out.println("-");
            } else {
                System.out.println("0");
            }
        }
    }
}