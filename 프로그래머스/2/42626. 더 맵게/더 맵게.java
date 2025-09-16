import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i < scoville.length ; i++){
            pq.add(scoville[i]);
        }
        int mixCount = 0;
        while(pq.size()>1 && pq.peek()<K){
            int first = pq.poll();
            int second = pq.poll();
            int mix = first + second*2;
            pq.add(mix);
            mixCount++;
        }
          // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.
        if (pq.peek() < K) 
            return -1;
        
        return mixCount;
    }
}