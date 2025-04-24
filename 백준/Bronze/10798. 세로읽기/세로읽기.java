import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];
        
        for(int i=0; i<5; i++){
            words[i] = sc.nextLine();
        }
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(words[j].length()>i){
                    sb.append(words[j].charAt(i));
                }
            }
        }
        System.out.println(sb.toString());
    }
}