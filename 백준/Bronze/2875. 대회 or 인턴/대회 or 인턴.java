import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 여학생 수
        int M = sc.nextInt(); // 남학생 수
        int K = sc.nextInt(); // 인턴쉽에 참여해야 하는 수
        int teamCount = 0;
        
        while (N >= 2 && M >= 1 && (N + M - K) >= 3) {
            N -= 2;
            M -= 1;
            teamCount++;
        }
        
        System.out.println(teamCount);
        
    }
}