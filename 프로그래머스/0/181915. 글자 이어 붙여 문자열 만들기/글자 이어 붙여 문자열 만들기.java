class Solution {
    public String solution(String my_string, int[] index_list) {
         // 정답 문자열
        String answer = "";
        
        // 인덱스에서 번호를 추출하고 그 번호에 맞는 char 추출해서 answer에 저장.
        for(int i = 0; i < index_list.length; i++) {
            int index = index_list[i];
            answer += my_string.charAt(index);  // my_string에서 직접 문자 추출
        }
        
        return answer;
    }
}