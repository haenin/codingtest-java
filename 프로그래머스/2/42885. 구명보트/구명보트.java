import java.util.Arrays;
class Solution {
      public int solution(int[] people, int limit) {
        int boats = 0;
        int lighter = 0;
        int heavier = people.length-1;

        Arrays.sort(people);
        while (lighter <= heavier){
            if(people[lighter] + people[heavier]  <= limit){
                lighter++;
            }
            heavier--;
            boats++;
        }
        return boats;
}
}