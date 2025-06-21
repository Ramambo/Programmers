import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<3; i++){
            list.add(sc.nextInt());
        }
        
        Collections.sort(list);
        
        for(int i=0; i<3; i++){
            System.out.print(list.get(i)+" ");
        }
    }
}