import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int num = 0;
        int[] arr = new int[p];
        
        for(int i=1; i<=p; i++){
            if(p%i == 0){
                arr[num++] =i;
            }
        }
        if(q <= num){
            System.out.println(arr[q - 1]);
        }else{
            System.out.println(0);
        }
        
    }
}