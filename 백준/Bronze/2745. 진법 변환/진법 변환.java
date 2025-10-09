import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] parts = input.split(" ");
        String N = parts[0];
        int B = Integer.parseInt(parts[1]);
        // N이 B진법 -> 10진법으로 바꾸자
        System.out.println(Integer.parseInt(N,B));
    }
}