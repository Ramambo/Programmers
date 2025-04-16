import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        // 앞뒤 공백 제거 후 공백 하나 이상 기준으로 split
        if(str.trim().isEmpty()){
            System.out.println(0);
        }else{
            String[] words = str.trim().split("\\s+");
            System.out.println(words.length);
        }
    }
}