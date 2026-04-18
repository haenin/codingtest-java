import java.util.*;
class Solution {
    public long solution(long n) {        
        Long[] arr = new Long[String.valueOf(n).length()];
        long result = 0;
        
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = n % 10;
            n = n / 10;
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        long answer = 0;
        for(int i = 0; i < arr.length; i++){
            answer = answer * 10 + arr[i];
        }
        return answer;
    }
}