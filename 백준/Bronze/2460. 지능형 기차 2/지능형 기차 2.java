import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        int hito = 0;
        
        for(int i=0; i<10; i++){
            int out = sc.nextInt();
            int in = sc.nextInt();
            
            hito = hito-out+in;
            if(hito > max){
                max = hito;
            }
        }
        System.out.println(max);
    }
}