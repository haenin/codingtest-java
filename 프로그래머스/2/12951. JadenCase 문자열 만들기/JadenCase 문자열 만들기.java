class Solution {
    public String solution(String s) {
        String answer = "";
        // 숫자는 단어의 첫문자에만 나올수 있음
        if(Character.isDigit(s.charAt(0))){
            answer += s.charAt(0);
        }else{
            answer += s.substring(0,1).toUpperCase();
        }
        
        
        for(int i = 1 ; i < s.length() ; i++){
            answer += s.substring(i,i+1).toLowerCase();
            if( i != s.length()-1 &&
                s.charAt(i)==' ' && s.charAt(i+1) != ' '){
                if(!Character.isDigit(s.charAt(i+1))){
                   answer += s.substring(i+1,i+2).toUpperCase();
                    i++;
                }
            }
        }
        return answer;
    }
}