class Solution {
    public int solution(int n) {
        int answer = 0;
        int value = 1;
            
        while(n % value != 1 ){
            value ++;
        }
        answer = value;
        return answer;
    }
}