import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ENTER 새로운 사람이 채팅방에 입장
        // 그 외 채팅을 입력한 유저의 닉네임
        // 새로운 사람이 입장
        // 이후에 처음 채팅은 곰곰티콘으로 인사한다
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] answer = new String[N];
        Set<String> set = new HashSet<>();
        int countList = 0;
        answer[0] = sc.nextLine();
        for (int i = 1; i < N; i++) {
            answer[i] = sc.nextLine();
            if(!answer[i].equals("ENTER")){
                set.add(answer[i]);
            }
            if( answer[i].equals("ENTER") // 두번째 엔터부터 시작
                || i == N-1){ // 마지막까지 카운트
                countList += set.size();
                set.clear();
            }
        }
        System.out.println(countList);
    }
}