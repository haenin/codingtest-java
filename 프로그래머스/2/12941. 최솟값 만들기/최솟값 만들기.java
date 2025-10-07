import java.util.Collections;
import java.util.PriorityQueue;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        // 오름차순
        PriorityQueue<Integer> pqA = new PriorityQueue<>();
        for(int a : A){
            pqA.add(a);
        }
        // 내림차순
        PriorityQueue<Integer> pqB = new PriorityQueue<>(Collections.reverseOrder());
        for(int b : B){
            pqB.add(b);
        }
        
        int commonSize = A.length;
        
        for(int i = 0 ; i < commonSize ; i++){
        // 작은거랑 큰거 곱하기
           answer += pqA.poll() * pqB.poll();
        }

        return answer;
    }
}