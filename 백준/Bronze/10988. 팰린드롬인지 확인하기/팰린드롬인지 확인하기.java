import java.util.Scanner;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = new StringBuilder(str).reverse().toString();
        
        if(str.equals(reverse)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
    }
}