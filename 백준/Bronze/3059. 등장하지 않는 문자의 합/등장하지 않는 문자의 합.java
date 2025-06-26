import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();  // nextInt 다음 개행 제거용

        for(int i = 0; i < T; i++){
            String S = sc.nextLine();

            int sum = 0;
            // 알파벳 대문자 ASCII 65~90
            for(int c = 65; c <= 90; c++){
                char ch = (char)c;
                if(S.indexOf(ch) == -1){
                    sum += c;
                }
            }
            System.out.println(sum);
        }
    }
}
