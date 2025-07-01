import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int num = 0;
        
        for(int i=0; i<5; i++){
            int sum = 0;
            for(int j=0; j<4; j++){
                sum += sc.nextInt();
            }
            if(sum > max){
                max = sum;
                num = i;
            }
        }
     System.out.println((num + 1) + " " + max);
    }
}