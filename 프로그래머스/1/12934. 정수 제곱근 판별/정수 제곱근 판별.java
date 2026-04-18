class Solution {
    public long solution(long n) {
        long answer = -1;
        long sqrt = (long)Math.sqrt(n);

        if(sqrt * sqrt == n){
            sqrt += 1;
            answer = sqrt * sqrt;
        }
        
        return answer;
    }
}