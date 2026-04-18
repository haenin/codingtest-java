class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int result = 0;
        int original = x;
        for (int i = 0 ; i < String.valueOf(original).length() ; i++){
            result += x % 10;
            x = x / 10;
        }
       
        if(original % result != 0){
            answer = false;
        }
        return answer;
    }
}