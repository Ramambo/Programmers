import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        
        for(int i=0; i<3; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        
        int d1 = num[1] - num[0];
        int d2 = num[2] - num[1];
        
        if(d1 == d2){
            System.out.println(num[2] + d1);
        }else if(d1 > d2){
            System.out.println(num[0] + d2);
        }else{
            System.out.println(num[1] + d1);
        }
    }
}