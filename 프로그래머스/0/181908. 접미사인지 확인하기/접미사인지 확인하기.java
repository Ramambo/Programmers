class Solution {
    public int solution(String my_string, String is_suffix) {
        // String의 endsWith 메서드를 사용해 접미사인지 확인
        if (my_string.endsWith(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }
}
