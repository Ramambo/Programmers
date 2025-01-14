class Solution {
    public String solution(String my_string, int n) {
        
//         int mlength = my_string.length();
//         int num = mlength - n;
//         return my_string.substring(num,mlength);
        
        return my_string.substring(my_string.length()-n);
    }
}