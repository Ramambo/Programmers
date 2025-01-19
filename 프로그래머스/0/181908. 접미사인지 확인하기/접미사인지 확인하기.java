class Solution {
    public int solution(String my_string, String is_suffix) {
        int length = my_string.length();
        String[] suffixes = new String[length];
        
        //모든 접미사를 생성하여 배열에 저장
        for(int i=0; i<length; i++){
            suffixes[i] = my_string.substring(i);
        }
// 접미사 배열에서 확인
        for (int i = 0; i < length; i++) {
            if (is_suffix.equals(suffixes[i])) {
                return 1;
            }
        }
        
        return 0; // 접미사를 찾지 못한 경우
    }
}