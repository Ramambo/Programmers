class Solution {
    public String solution(String[] seoul) {
        
        for(int i=0; i<seoul.length; i++){
            if (seoul[i].equals("Kim")){
                return "김서방은 "+i+"에 있다";
            }
        }
        
        return "Kim을 찾을 수 없습니다."; // Kim이 없을 경우 처리
        
    }
}