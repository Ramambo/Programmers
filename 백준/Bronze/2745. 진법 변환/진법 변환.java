import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int Bsys = sc.nextInt();
        
        int result = 0;
        int power = 0;
        
        for(int i=num.length()-1; i>=0; i--){
            char c = num.charAt(i);
            int digit = (c>='A')? c-'A' + 10 : c - '0';
            result += digit * Math.pow(Bsys, power);
            power++;
        }
        
        System.out.println(result);
        
    }
}