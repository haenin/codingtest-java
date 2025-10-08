class Solution {
    public int solution(int n) {
        int answer = 0;
        // f(0) = 0
        // f(1) = 1
        if (n == 0) return 0;
        if (n == 1) return 1;
 
        int x = 0;
        int y = 1;
        int sum = 0;
        for(int i = 2; i <= n ; i++){
            sum = (x + y) % 1234567;
            x = y;
            y = sum;
        }
        
        return y;
    }
   // 재귀 함수
   /* public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    } */
}