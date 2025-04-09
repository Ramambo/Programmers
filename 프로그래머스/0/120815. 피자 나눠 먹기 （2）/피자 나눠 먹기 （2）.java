class Solution {
    //최대공약수 메서드
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int solution(int n) {
        int lcm = (6*n)/gcd(6,n); // 최소공배수
        return lcm/6; // 필요한 피자 판 수 
    }
}