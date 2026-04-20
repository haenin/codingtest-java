class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        int even = 0;
        int present = left;
        
        for(int i = 0 ; i <= right - left ; i++){
            even = 0;
            for(int j = 1 ; j <= present ; j++){
                if(present % j == 0 ){
                    even ++;    
                }
            }
            if(even % 2 == 0){
                answer += present;
            }else{
                answer -= present;
            }
            present ++;    
        }
        
        return answer;
    }
}