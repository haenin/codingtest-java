class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        long original = (long)x;
        for(int i = 0 ; i < n ; i++){
            answer[i] = original + original * i;
            
        }
        return answer;
    }
}