import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[7]; 
        int sum = 0;
        int min = 100;
        
        for(int i=0; i<7; i++){
            num[i] = sc.nextInt();
            if(num[i] % 2 == 1){
                sum += num[i];
                if(num[i] < min){
                    min = num[i];
                }
            }
        }
        
        if(sum == 0){
            System.out.println("-1");
        }else{
            System.out.println(sum);
        }
        
        if(min < 100){
            System.out.println(min);
        }
        
        
    }
}