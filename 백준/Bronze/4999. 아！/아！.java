import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String jea = sc.nextLine();
        String doc = sc.nextLine();
        
        int myLength = jea.length() - 1;
        int docLength = doc.length() -1; 
        
        if(myLength >= docLength){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
        
    }
}