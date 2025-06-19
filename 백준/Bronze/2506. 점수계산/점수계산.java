import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int streak = 0;
        
        for(int i=0; i<N; i++){
            int input = sc.nextInt();
            if(input == 1){
                streak++;
                sum += streak;
            } else{
                streak = 0;
            }
        }
        
        System.out.println(sum);
    }
}