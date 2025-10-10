import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 사람들이 만난 기록 개수 N
        // 댄스를 추지 않는 사람이 추는 사람을 만나면 추게 된다
        // 기록이 시작 전 춤을 추는 사람은 총총이 뿐
        // 마지막에 춤을 추는 사람의 수를 구하자
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        final String CC = "ChongChong";
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String[] name = new String[2];
            name[0] = sc.next();
            name[1] = sc.next();
            if(name[0].equals(CC)){
                set.add(name[1]);
            }
            if(name[1].equals(CC)) {
                set.add(name[0]);
            }
            if(set.contains(name[0])) {
                set.add(name[1]);
            }
            if(set.contains(name[1])) {
                set.add(name[0]);
            }
        }
        System.out.println(set.size());
    }

}
