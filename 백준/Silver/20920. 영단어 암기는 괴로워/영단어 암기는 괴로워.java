import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 우선순위 1 -> 2 -> 3
        // 1. 자주 나오는 단어는 앞에 배치
        // 2. 해당 단어의 길이가 길수록 앞에 우선
        // 3. 알파벳 사전 순으로 앞에 우선
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] parts = line.split(" ");
        int N = Integer.parseInt(parts[0]); // 단어개수
        int M = Integer.parseInt(parts[1]); // M길이 이상인 단어만 출력
        String[] input = new String[N];
        for (int i = 0; i < N; i++) {
            input[i] = br.readLine();
        }

        List<String> wordsList = new ArrayList<>();
        // 길이 체크
        for (int i = 0; i < input.length; i++) {
            if(input[i].length() >= M){
                wordsList.add(input[i]);
            }
        }
        // 자주 나오는 단어 빈도 체크
        Map<String, Integer> wordsMap = new HashMap<>();
        for (int i = 0; i < wordsList.size(); i++) {
            wordsMap.put(wordsList.get(i), wordsMap.getOrDefault(wordsList.get(i),0) +1);
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(wordsMap.entrySet());

        list.sort((a,b)-> {
           // 1. 자주 나오는 애가 먼저 (내림차순)
            if(!a.getValue().equals(b.getValue()))
               return b.getValue()-a.getValue();
            // 2. 빈도수 동일시 길이긴애가 먼저(내림차순)
            if(a.getKey().length() != b.getKey().length())
                return b.getKey().length() - a.getKey().length();
            // 3. 빈도수 동일 길이 동일시 알파벳순
                return a.getKey().compareTo(b.getKey());
        });

        // 출력
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : list) {
            sb.append(entry.getKey()).append("\n");
        }
        System.out.print(sb);

    }
}
