import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> nums = new HashMap<>();

        // 1. 각 숫자의 등장 횟수 카운트
        for (int n : array) {
            nums.put(n, nums.getOrDefault(n, 0) + 1);
        }

        // 2. 최빈값 찾기
        int maxCount = 0;
        int mode = -1;

        for (int key : nums.keySet()) {
            int count = nums.get(key);

            if (count > maxCount) {
                maxCount = count;
                mode = key;
            } else if (count == maxCount) {
                mode = -1;  // 최빈값이 여러 개면 -1
            }
        }

        return mode;
    }
}
