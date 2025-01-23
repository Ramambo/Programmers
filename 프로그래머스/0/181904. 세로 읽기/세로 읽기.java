class Solution {
    public String solution(String my_string, int m, int c) {
        int row = (int) Math.ceil((double) my_string.length() / m); // 행의 개수 계산
        char[][] array = new char[row][m]; // 행(row)과 열(m) 크기의 2차원 배열 생성
        int index = 0;

        // 문자열을 2차원 배열에 채우기
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < m; j++) {
                if (index < my_string.length()) {
                    array[i][j] = my_string.charAt(index++);
                } else {
                    array[i][j] = ' '; // 남는 공간 처리
                }
            }
        }

        // c번째 열의 문자 추출
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < row; i++) {
            if (array[i][c - 1] != ' ') { // 유효한 문자만 추가
                result.append(array[i][c - 1]);
            }
        }

        return result.toString();
    }
}
