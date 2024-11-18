class Solution {
    public int[] solution(String[] park, String[] routes) {
        // 공원의 크기 정의
        int rows = park.length;
        int cols = park[0].length();

        // 공원을 2차원 배열로 변환
        char[][] park2 = new char[rows][];
        for (int i = 0; i < rows; i++) {
            // 각 문자열을 문자 배열로 변환하여 2차원 배열의 한 행으로 설정
            park2[i] = park[i].toCharArray();
        }

        // 시작 위치 찾기
        int x = 0, y = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (park2[i][j] == 'S') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        // 방향 정의
        int[][] directions = {
            {-1, 0}, // N
            {1, 0},  // S
            {0, 1},  // E
            {0, -1}  // W
        };
        String[] directionKeys = {"N", "S", "E", "W"};

        // 명령어 처리
        for (String route : routes) {
            String[] parts = route.split(" ");
            String dir = parts[0];
            int distance = Integer.parseInt(parts[1]);

            // 방향 인덱스 찾기
            int dirIndex = -1;
            for (int i = 0; i < directionKeys.length; i++) {
                if (directionKeys[i].equals(dir)) {
                    dirIndex = i;
                    break;
                }
            }

            // 이동 가능 여부 확인
            int nx = x, ny = y;
            boolean valid = true;
            for (int i = 0; i < distance; i++) {
                nx += directions[dirIndex][0];
                ny += directions[dirIndex][1];

                // 경계선 및 장애물 확인
                if (nx < 0 || ny < 0 || nx >= rows || ny >= cols || park2[nx][ny] == 'X') {
                    valid = false;
                    break;
                }
            }

            // 유효한 이동인 경우 위치 업데이트
            if (valid) {
                x = nx;
                y = ny;
            }
        }

        return new int[]{x, y};
    }
}