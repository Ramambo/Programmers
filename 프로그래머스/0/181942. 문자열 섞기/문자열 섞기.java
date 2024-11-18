class Solution {
    public String solution(String str1, String str2) {
        String[] str11 = str1.split("");
        String[] str22 = str2.split("");
        
        String answer="";
        
        for(int i=0; i<str11.length; i++){
            answer = answer+str11[i]+str22[i];
        }
        
        return answer;
        
    }
}