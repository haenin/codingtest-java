import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";   
         Integer[] integerNumbers = Arrays.stream(numbers)
                                     .boxed()
                                     .toArray(Integer[]::new);
        
         Arrays.sort(integerNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String s1 = a.toString();
                String s2 = b.toString();

                // 문자열 이어붙여서 비교 (내림차순)
                String ab = s1 + s2;
                String ba = s2 + s1;

                return ba.compareTo(ab); // 내림차순
            }
        });
        // 가장 큰 정수 만들기
        for(int n : integerNumbers){
            // 6 2 10
            answer += n;
        }
        // 실패떠서 추가
        if (answer.charAt(0) == '0') {
            return "0";
        }
        return answer;
    }
}