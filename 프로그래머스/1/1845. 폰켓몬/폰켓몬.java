import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] nums) {
        // 조건: num의 길이는 항상 짝수
        // num.length/2
        // 가장많은 종류의 포켓몬을 가져가보자
        
        Set<Integer> result = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
                result.add(nums[i]);
            }//for
         if(result.size() > nums.length / 2){
             return nums.length / 2;
         }
         
         return result.size();
  }
}