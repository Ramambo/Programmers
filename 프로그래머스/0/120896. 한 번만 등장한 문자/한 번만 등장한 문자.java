class Solution {
    public String solution(String s) {
        int[] alphabet = new int[26];
        
        for(int i=0; i<s.length(); i++){
            alphabet[s.charAt(i)-'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            if(alphabet[i] == 1){
                sb.append((char)('a'+ i));
            }
        }
        
        return sb.toString();
    }
}