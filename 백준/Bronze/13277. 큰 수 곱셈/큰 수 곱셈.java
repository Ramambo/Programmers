import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());
        
        BigInteger sum = A.multiply(B);
        
        System.out.println(sum);
    }
}