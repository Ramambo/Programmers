import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] narr = new int[N];
        for(int i=0; i<N; i++){
            narr[i] = sc.nextInt();
        }
        
        int max = 0;
        
        for(int i=0; i<N-2; i++){
            int sum = 0;
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    sum = narr[i] + narr[j] + narr[k];
                    if(sum <= M && sum > max){
                        max = sum;
                    }
                }
            }
        }
        
        System.out.println(max);
    }
}