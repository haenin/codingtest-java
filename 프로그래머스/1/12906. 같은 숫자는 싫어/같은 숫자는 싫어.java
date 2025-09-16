import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i = 1; i <arr.length ; i++){
            if(arr[i-1]==arr[i]){
               continue;
            }else if(arr[i-1] != arr[i]){
                result.add(arr[i]);
            }
        }
        
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}