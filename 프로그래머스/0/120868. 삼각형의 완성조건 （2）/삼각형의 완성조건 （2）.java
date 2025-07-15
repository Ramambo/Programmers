import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        // 배열 정렬
        Arrays.sort(sides);
        
        // 1. sides[1] 이 제일 긴 변일 때
        for(int i = sides[1] - sides[0] + 1; i <= sides[1]; i++){
            answer++;
        }
        
        // 2. 나머지 한 변이 가장 긴 변 인경우
        for(int i = sides[1] + 1; i < sides[0] + sides[1]; i++){
            answer++;
        }
        
        return answer;
    }
}