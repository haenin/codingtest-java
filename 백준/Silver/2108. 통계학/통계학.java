import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 입력 개수 N
        // 1. 산술평균 (소수점 이하 첫째자리 반올림)
        // 2. 중앙값
        // 3. 최빈값 여러개인경우 최빈값 중 두번째로 작은값 출력
        // 4. 범위
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] input = new int[N];
        int total = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
            total += input[i];
            map.put(input[i], map.getOrDefault(input[i], 0) + 1);
        }
        
        int first = (int) Math.round((double) total / N);
        
        Arrays.sort(input);
        int second = input[N / 2];

        // 최빈값
        int max = Collections.max(map.values());
        List<Integer> list = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                list.add(key);
            }
        }
        Collections.sort(list);
        int third;
        if (list.size() > 1) {
            third = list.get(1); // 두 번째로 작은 값
        } else {
            third = list.get(0);
        }
        
        int fourth = input[N - 1] - input[0];

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}
