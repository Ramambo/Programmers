class Solution {
    public int solution(int a, int b) {
        
        //a와 b를 문자열로 변환
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        
        //각각의 문자를 char 배열로 변환
        char[] integerChars = (aStr+bStr).toCharArray();
        
        // char 배열을 숫자로 변환
        int combinedNumber = Integer.parseInt(new String(integerChars));
        
        if(combinedNumber > 2*a*b){
            return combinedNumber;
        }else{
            return 2*a*b;
        }
    }
}