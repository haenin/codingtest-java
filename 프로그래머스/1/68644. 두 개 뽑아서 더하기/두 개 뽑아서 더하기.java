import java.util.HashSet;
import java.util.Set;
import java.util.Iterator; 
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        for(int i =0; i< numbers.length ; i++){
           for(int j = i+1; j < numbers.length ; j++){
               set.add(numbers[i] + numbers[j]);
           }
       }//for
        
        int[] answer = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        int index = 0;
        while (it.hasNext()) {
            answer[index++] = it.next();
        }
        Arrays.sort(answer);
        
    return answer;
    }
    }