import java.util.PriorityQueue;
import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 체육복 가져오지 않은 학생들 제거
        int answer = n - lost.length;

        // 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있음
        boolean[] used = new boolean[reserve.length];
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;        // 본인 걸 입을 수 있음
                    lost[i] = -1;    // 처리 완료 표시
                    used[j] = true;  // 여벌 사용됨
                    break;
                }
            }
        }

        // 나머지 학생에게 빌려주기
        for (int i = 0; i < lost.length; i++) {
            if (lost[i] == -1) continue;

            for (int j = 0; j < reserve.length; j++) {
                if (used[j]) continue;
                if (reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
                    answer++;
                    used[j] = true; // 빌려줬다고 표시
                    break;
                }
            }
        }

        return answer;
    }
}
