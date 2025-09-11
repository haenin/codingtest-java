import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        List<Integer> list = new ArrayList<>(Arrays.asList(a, b, c, d));
        Collections.sort(list);
        int A = list.get(0), B = list.get(1), C = list.get(2), D = list.get(3);

        // 1) 네 개 같음
        if (A == D) return 1111 * A;

        // 2) 쓰리카인드 (앞쪽 3개 or 뒤쪽 3개)
        if (A == C) {                 // A A A D
            int p = A, q = D;
            int v = 10 * p + q;
            return v * v;
        }
        if (B == D) {                 // A B B B
            int p = D, q = A;
            int v = 10 * p + q;
            return v * v;
        }

        // 3) 투페어
        if (A == B && C == D) return (A + D) * (D - A);

        // 4) 원페어 (세 위치 모두 처리)
        if (A == B) return C * D;     // A A C D
        if (B == C) return A * D;     // A B B D  ← 추가
        if (C == D) return A * B;     // A B C C  ← 추가

        // 5) 전부 다름
        return A;
    }
}
