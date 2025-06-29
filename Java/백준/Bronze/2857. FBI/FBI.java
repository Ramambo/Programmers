import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> fbiAgents = new ArrayList<>();
        
        for(int i=1; i<=5; i++){
            String name = sc.nextLine();
            if(name.contains("FBI")){
                fbiAgents.add(i);
            }
        }
        
        if(fbiAgents.isEmpty()){
            System.out.println("HE GOT AWAY!");
        }else{
            for(int idx : fbiAgents){
                System.out.print(idx + " ");
            }
        }
        
    }
}