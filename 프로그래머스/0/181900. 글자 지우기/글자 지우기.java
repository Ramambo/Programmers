import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        // my_string을 ArrayList<Character>로 변환
        List<Character> mString = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            mString.add(c);
        }

        // indices 배열을 내림차순으로 정렬 (큰 인덱스부터 삭제)
        Arrays.sort(indices);

        for (int i = indices.length - 1; i >= 0; i--) {
            mString.remove(indices[i]);  // 인덱스 삭제
        }

        // StringBuilder로 결과 문자열 생성
        StringBuilder sb = new StringBuilder();
        for (char c : mString) {
            sb.append(c);
        }
        
        return sb.toString();// String으로 변환
    }
}
