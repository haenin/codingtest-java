public class Solution {
    public int solution(int n) {
        int answer = 0;
        // String str = String.valueOf(n);        
        String str = Integer.toString(n);
        for(int i = 0 ; i < str.length(); i ++){
            answer += Integer.parseInt(str.substring(i,i+1));
            //answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return answer;
    }
}