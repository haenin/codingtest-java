import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        // 판매하려는 귤의 개수 k
        // answer는 귤의 크기 종류
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < tangerine.length; i++){
            int key = tangerine[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        // 2 2 2 1 1
        int total = 0;
        for(int i = 0; i < list.size(); i++){
            total += list.get(i);
            answer++;
            if(k <= total){
                break;
            }
        }
        return answer;
    }
}