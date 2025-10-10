import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 양수 A가 N의 진짜 약수가 되기위한 조건
        // 1. N은 A의 배수이다.
        // 2. A가 1과 N은 아니다.
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] N = new int[count];
        for (int i = 0; i < count; i++) {
            N[i] = sc.nextInt();
        }
        Arrays.sort(N);
        int A = 0;
        if(N[0] != 1){
            A = N[0] * N[count-1];
        }else{
            A = N[1] * N[count-1];
        }
        System.out.print(A);
    }
}
