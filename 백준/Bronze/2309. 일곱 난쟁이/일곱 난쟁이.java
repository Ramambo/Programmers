import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] height = new int[9];
        int sum = 0;
        
        for(int i=0; i<9; i++){
            height[i] = sc.nextInt();
            sum += height[i];
        }
        
        outer:
        for(int i=0; i<9; i++){
            for(int j = i+1; j<9; j++){
                if(sum - height[i] -height[j] == 100){
                    List<Integer> result = new ArrayList<>();
                    for(int k=0; k<9; k++){
                        if(k !=i && k!= j){
                            result.add(height[k]);
                        }
                    }
                    Collections.sort(result);
                    for(int h : result){
                        System.out.println(h);
                    }
                    break outer;
                }
            }
        }
    }
}