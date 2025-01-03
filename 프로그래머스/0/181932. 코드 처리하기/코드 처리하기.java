class Solution {
    public String solution(String code) {
        int mode=0; // 초기 mode는 0으로 설정
        StringBuilder result = new StringBuilder(); // 결과 문자열 저장
        
        for(int i=0; i<code.length(); i++){
            char currentChar = code.charAt(i);
            
            if(currentChar == '1'){
                mode = 1 - mode; // mode 값을 전환
                continue; // 결과에 포함하지 않음.
            }
            
            //mode 에 따른 조건 처리
            if(mode == 0 && i%2 == 0 ){ //mode 가 0이고 짝수 인덱스 일 때
                result.append(currentChar);
            }else if(mode==1 && i%2==1){
                result.append(currentChar);
            }
        }
        //결과 반환(비어있으면 "EMPTY" 반환하기)
        return result.length() > 0 ? result.toString() : "EMPTY";
    }
}