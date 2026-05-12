class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = gcd(n,m);
        int lcm = n * m / gcd;
        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }
    
    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}