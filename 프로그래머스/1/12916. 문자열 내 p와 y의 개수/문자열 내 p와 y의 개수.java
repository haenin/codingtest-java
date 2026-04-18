class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] c = s.toCharArray();
        int count_p = 0;
        int count_y = 0;
        for(int i = 0; i < s.length(); i++){
            if(c[i] =='p' || c[i]=='P'){
                count_p++;
            }else if(c[i] =='y' || c[i]=='Y'){
                count_y++;
            }
        }
        
        if(count_p != count_y){
            answer = false;
        }

        return answer;
    }
}