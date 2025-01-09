import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        // 주사위 숫자들을 배열에 담기
        int[] dice = {a, b, c, d};
        // 숫자의 빈도 계산
        Map<Integer, Integer> frequency = new HashMap<>();
        
        for (int num : dice) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        // 빈도에 따라 점수 계산
        List<Integer> frequencies = new ArrayList<>(frequency.values());
        Collections.sort(frequencies, Collections.reverseOrder());  // 빈도를 내림차순 정렬
        
        if (frequencies.size() == 1) {
            // 네 주사위 숫자가 모두 같을 경우
            int p = dice[0];
            return 1111 * p;
        } else if (frequencies.size() == 2) {
            if (frequencies.get(0) == 3) {
                // 세 주사위 숫자가 같고, 나머지 하나는 다를 경우
                int p = 0, q = 0;
                for (int num : frequency.keySet()) {
                    if (frequency.get(num) == 3) {
                        p = num;
                    } else {
                        q = num;
                    }
                }
                return (10 * p + q) * (10 * p + q);
            } else {
                // 두 주사위가 같은 값이 두 개일 경우
                int p = 0, q = 0;
                for (int num : frequency.keySet()) {
                    if (frequency.get(num) == 2) {
                        if (p == 0) {
                            p = num;
                        } else {
                            q = num;
                        }
                    }
                }
                return (p + q) * Math.abs(p - q);
            }
        } else if (frequencies.size() == 3) {
            // 두 주사위에서 나온 숫자가 p로 같고, 나머지 숫자들은 각각 다를 경우
            int q = 0, r = 0;
            for (int num : frequency.keySet()) {
                if (frequency.get(num) == 1) {
                    if (q == 0) {
                        q = num;
                    } else {
                        r = num;
                    }
                }
            }
            return q * r;
        } else {
            // 네 주사위 숫자가 모두 다를 경우
            int min = Arrays.stream(dice).min().getAsInt();
            return min;
        }
    }
}