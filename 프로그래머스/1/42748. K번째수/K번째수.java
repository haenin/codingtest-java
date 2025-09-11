import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] resultArray = new int[commands.length];
        
        for (int i = 0; i < commands.length ; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int resultIndex = commands[i][2];
            for (int j = start-1; j < end; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            resultArray[i]=list.get(resultIndex-1);
            list.clear();
        }

        return resultArray;
    }
}