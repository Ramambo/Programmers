class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] str = my_string.toCharArray();
        
        char x = str[num1];
        str[num1] = str[num2];
        str[num2] = x;
        
        return new String(str);
    }
}