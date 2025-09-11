import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> answerList = new ArrayList<>();  // 원래 answer 배열 대신 List
        StringBuilder wordBuilder = new StringBuilder(); // 단어 조립용
        boolean isGapTrue = false; // 지금 공백 상태인지

        int index = 0;
        while (index < my_string.length()) {
            char c = my_string.charAt(index);

            if (c != ' ') {  // 공백 아니면 글자 이어붙이기
                wordBuilder.append(c);
                isGapTrue = true;
            } else {          // 공백을 만났을 때
                if (isGapTrue) { // 직전까지 단어를 만들고 있었으면
                    answerList.add(wordBuilder.toString());
                    wordBuilder.setLength(0); // StringBuilder 비우기
                    isGapTrue = false;
                }
            }
            index++;
        }

        // 마지막 단어 처리
        if (isGapTrue) {
            answerList.add(wordBuilder.toString());
        }

        // List → 배열로 변환
        String[] arr = answerList.toArray(new String[answerList.size()]);
        return arr;
    }
}
