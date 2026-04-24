class Solution {
    public boolean solution(String s) {
        boolean answer = false;        
        if(s.length() != 4 && s.length() != 6){
            return answer;
        }
        
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            if((c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= 'a' && c[i] <= 'z')){
                return answer;
            }
        }
        answer = true;
        return answer;
    }
}