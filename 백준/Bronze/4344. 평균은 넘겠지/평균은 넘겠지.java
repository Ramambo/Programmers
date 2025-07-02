import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        
        for(int i=0; i<C; i++){
            int N = sc.nextInt();
            int[] score = new int[N];
            int sum = 0;
            for(int j=0; j<N; j++){
                score[j] = sc.nextInt();
                sum += score[j];
            }
            double avg = (double) sum / N;

            int cnt = 0;
            for(int j=0; j<N; j++){
                if(score[j] > avg){
                    cnt++;
                }
            }
            double rate = (double)cnt / N * 100;
            
            System.out.printf("%.3f%%\n",rate);
            
        }
        
    }
}