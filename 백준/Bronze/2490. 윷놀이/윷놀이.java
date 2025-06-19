import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] Yut = new int[3][4];
        for(int i=0; i<3; i++){
            int one = 0;
            for(int j=0; j<4; j++){
                Yut[i][j] = sc.nextInt();
                if(Yut[i][j] == 1){
                    one++;
                }
            }
            switch(one){
                case 0 : System.out.println("D"); break;
                case 1 : System.out.println("C"); break;
                case 2 : System.out.println("B"); break;
                case 3 : System.out.println("A"); break;
                case 4 : System.out.println("E"); break;
            }
        }
    }
}