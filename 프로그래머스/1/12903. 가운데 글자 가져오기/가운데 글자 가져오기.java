class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArr = s.toCharArray();
        int length = s.length();
        if(length % 2 == 0){
            length /= 2;
            answer = String.valueOf(charArr[length-1]) 
                   + String.valueOf(charArr[length]);
        }else{
            length /= 2;
            answer = String.valueOf(charArr[length]);
        }
        
        return answer;
        
    }
}