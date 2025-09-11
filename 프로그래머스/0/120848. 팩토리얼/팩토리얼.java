class Solution {
    public int solution(int n) {
       
        int total = 1;
        for(int result = 1 ; ; result++){
            total *= result;
            if(total == n){
                return result;
            }
            if(total > n){
                return result-1;
            }
        }
    }
}