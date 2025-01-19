class Solution {
    public int solution(String my_string, String is_prefix) {
        // String의 startsWith 메서드를 사용해 접두사인지 확인
        if(my_string.startsWith(is_prefix)){
            return 1;
        }else{
            return 0;
        }
    }
}