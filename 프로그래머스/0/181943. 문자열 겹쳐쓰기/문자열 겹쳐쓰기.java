class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String[] mstring = my_string.split("");
        String[] ostring = overwrite_string.split("");
        
        for (int i = 0; i < ostring.length; i++) {
            mstring[s + i] = ostring[i];
        }
        
        //배열을 다시 문자열로 합치기
        return String.join("", mstring);
    }
}