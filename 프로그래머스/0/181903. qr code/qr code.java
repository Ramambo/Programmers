class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<code.length(); i++){
            if(i % q == r){
                answer.append(code.charAt(i)); //조건에 맞는 문자 추가
            }
        }
        return answer.toString();
    }
}
