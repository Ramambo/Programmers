class Solution {
    public String solution(String my_string, int s, int e) {
        // 문자열의 앞부분 (s 이전까지)
        String prefix = my_string.substring(0,s);

        // s부터 e까지의 부분 문자열 추출 및 뒤집기
        String middle = my_string.substring(s, e + 1);
        String reversedMiddle = new StringBuilder(middle).reverse().toString();

        // 문자열의 뒷부분 (e 이후부터)
        String suffix = my_string.substring(e + 1);

        // 결과 문자열 조합
        return prefix + reversedMiddle + suffix;
    }
}
