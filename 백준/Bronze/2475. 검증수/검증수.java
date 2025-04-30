import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        
        String[] inputs = line.split(" ");
        
        int sum = 0;
        
        for (String input : inputs) {
            int num = Integer.parseInt(input);
            sum += num * num;
        }
        
        System.out.println(sum % 10);
    }
}
