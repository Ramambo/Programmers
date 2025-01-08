import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        // ArrayList 생성
        ArrayList<Integer> alList = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (alList.isEmpty()) { // alList가 비었는지 확인
                alList.add(arr[i++]);
            } else if (alList.get(alList.size() - 1) < arr[i]) { // 마지막 원소와 비교
                alList.add(arr[i++]);
            } else {
                alList.remove(alList.size() - 1); // 마지막 원소 제거
            }
        }

        // ArrayList를 배열로 변환
        int[] stk = new int[alList.size()];
        for(int j = 0; j<alList.size(); j++){
            stk[j] = alList.get(j);
        }
        
        return stk;
    }
}
