class Solution {
    public int solution(int n) {
        int answer = 0;
        // 1. n보다 큰 자연수
        // 2. n보다 큰 숫자는 n을 2진수로 변환했을때 1의 개수가 동일
        // => n보다 큰 숫자는 조건 1,2를 만족하는 숫자중 가장 작은 수
 
        // String binary = Integer.toBinaryString(n);
        
        int count = 0;
        int b = n;
        while(b > 0){
            if((b & 1) == 1){
                count++;
            }
            b = b >> 1;
        }
        
       
        /* long countCheck = 0;
        for(int i = n+1; ;i++){
            countCheck = Integer.toBinaryString(i)
                    .chars() // 문자열을 문자 단위 스트림으로
                    .filter(c -> c == '1') // '1'인 문자만 필터링
                    .count(); // 개수 세기 
            if(count == countCheck){
                answer = i;
                break;
            }
        } 효율 떨어짐 */ 
        
        while (true) {
            n++;
            int check = 0;
            int x = n;
            while (x > 0) {
                if ((x & 1) == 1) check++;
                x >>= 1;
            }
            if (check == count) return n;
        }

    }
}