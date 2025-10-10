import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] C = new int[T];
        for (int i = 0; i < T; i++) {
            C[i] = sc.nextInt();
        }

        final int Q = 25;
        final int D = 10;
        final int N = 5;
        final int P = 1;
        int[][] out = new int[T][4];
        for (int i = 0; i < T; i++) {
            out[i][0] = C[i] / Q;
            C[i] = C[i] % Q;
            out[i][1] = C[i] / D;
            C[i] = C[i] % D;
            out[i][2] = C[i] / N;
            C[i] = C[i] % N;
            out[i][3] = C[i] / P;
        }
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(out[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}