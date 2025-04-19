import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        word = word.toLowerCase();
        int[] freq = new int[26];
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        int maxCount = 0;
        char maxChar = '?';
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                maxChar = (char) (i + 'a');
            } else if (freq[i] == maxCount) {
                maxChar = '?';
            }
        }
        
        System.out.println(Character.toUpperCase(maxChar));
    }
}
