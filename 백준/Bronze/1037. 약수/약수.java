import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.println(arr[0] * arr[len-1]);
        
    }
}