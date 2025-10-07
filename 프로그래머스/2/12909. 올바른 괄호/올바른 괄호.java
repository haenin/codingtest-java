class Solution {
    boolean solution(String s) {
        boolean answer = false;
        if(s.length() <= 1) return answer;
        if(s.charAt(0) == ')') return answer;
        // ( 개수랑 ) 개수가 같아야함
        // 개수가 같아도 예외있음 -> (()))(
        // => 끝에가 ) 이게오도록
        if(s.charAt(s.length()-1) == '(') return answer;
        // 개수세기
        int left = 0;
        int right = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='('){
                left++;
            }
            else if(s.charAt(i)==')'){
                right++;
            }
            if(right>left){
                return answer;
            }
            // ())(()
        }
        if(left == right){
            answer=true;
        }
        return answer;
    }
}