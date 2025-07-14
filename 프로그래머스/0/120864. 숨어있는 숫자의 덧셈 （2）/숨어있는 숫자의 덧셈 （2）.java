import java.util.*;

public class Solution {
    public int solution(String my_string) {
        String[] nums = my_string.split("[^0-9]+");

        int sum = 0;
        for (String num : nums) {
            if (!num.equals("")) {
                sum += Integer.parseInt(num);
            }
        }

        return sum;
    }
}
