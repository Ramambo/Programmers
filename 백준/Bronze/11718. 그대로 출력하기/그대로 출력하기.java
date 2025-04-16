import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //입력을 한 줄씩 처리하면서 출력하는 반복문
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        
    }
}