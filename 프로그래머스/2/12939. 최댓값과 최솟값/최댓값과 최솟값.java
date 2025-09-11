import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 반환: "최소값 최대값"
        StringTokenizer st = new StringTokenizer(s);
        List<Integer> list = new ArrayList<>();
       
        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }
        // 최소,최대값 구하기
        int min = list.get(0);
        int max = list.get(0);
        for(int i = 1 ; i < list.size() ;i++){
            if(min > list.get(i))
                min = list.get(i);
            if(max < list.get(i))
                max = list.get(i);
        }
        
        
        StringBuilder sb = new StringBuilder();
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        
        return sb.toString();
    }
}