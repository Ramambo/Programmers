import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        //선수 이름과 순위를 저장하는 Map을 생성한다.
        Map<String, Integer> rankMap = new HashMap<>();
        for(int i = 0; i<players.length; i++){
            rankMap.put(players[i],i); // 선수의 이름과 등수를 저장한다.
        }
        
        //호출된 선수에 따라 순위를 변경한다.
        for (int i = 0; i < callings.length; i++) {
            String calling = callings[i]; // 호출된 선수
            int currentRank = rankMap.get(calling); // 호출된 선수의 현재 등수
            int prevRank = currentRank - 1; // 바로 앞 순위

            // 앞의 선수와 자리 교환
            String prevPlayer = players[prevRank];
            players[prevRank] = calling;
            players[currentRank] = prevPlayer;

            // Map에서 순위 업데이트
            rankMap.put(calling, prevRank);
            rankMap.put(prevPlayer, currentRank);
    }
        
        return players;
    }
}