class Solution {
    public int solution(int num) {
        int answer = 0;
        long num_long = num;
        while(num_long != 1 && answer < 500){
            if(num_long % 2 == 0){
                num_long /= 2;
            }else {
                num_long = num_long * 3 + 1;
            }
            answer ++;
        }
        
        if(answer == 500) {
            return -1;
        }
        
        return answer;
    }
}