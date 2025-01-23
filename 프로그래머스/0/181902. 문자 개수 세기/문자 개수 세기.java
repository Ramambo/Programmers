class Solution {
    public int[] solution(String my_string) {
        //결과를 저장할 배열 
        int[] counts = new int[52];
        
        //문자열을 순회하며 문자 개수 세기
        for(char ch: my_string.toCharArray()){
            if('A'<= ch && ch <= 'Z'){ //대문자인 경우
                counts[ch - 'A']++;
            } else if('a' <= ch && ch<= 'z'){ // 소문자인 경우
                counts[ch-'a'+26]++;
            }
        }
        return counts;
    }
}