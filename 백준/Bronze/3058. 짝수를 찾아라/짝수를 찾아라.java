import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i=0; i<T; i++){
            int[] num = new int[7];
            int sum = 0;
            int min = 101;
            for(int j=0; j<7; j++){
                num[j] = sc.nextInt();
                if(num[j] % 2==0){
                    sum += num[j];
                    if(num[j] < min){
                        min = num[j];
                    }
                }
            }
            System.out.println(sum + " " + min);
        }
        
    }
}