import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i=0; i<a.length(); i++){
            char ch = a.charAt(i);
            if(Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
                System.out.print(ch);
            }
            else{
                ch = Character.toUpperCase(ch);
                System.out.print(ch);
            }
        }
        
    }
}