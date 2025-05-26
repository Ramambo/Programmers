import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // 좌표 계산: (행, 열)
        int rowA = (A - 1) / 4;
        int colA = (A - 1) % 4;
        int rowB = (B - 1) / 4;
        int colB = (B - 1) % 4;
        
       // 직각거리 = 행 차이 + 열 차이
        int distance = Math.abs(rowA - rowB) + Math.abs(colA - colB);
        
        System.out.println(distance);
    }
}