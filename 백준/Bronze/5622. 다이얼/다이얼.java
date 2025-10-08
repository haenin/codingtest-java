import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 1 -> 2초
        // 9 -> 10초
        String input = sc.nextLine();
        // ABC -> 3 (65)
        // DEF -> 4
        // GHI -> 5
        // JKL -> 6
        // MNO -> 7
        // PQRS -> 8
        // TUV -> 9
        // WXYZ -> 10 (90)
        int total = 0;
        for (int i = 0; i < input.length(); i++) {
            int ascii = input.charAt(i);
            if(ascii <= 67){
                total += 3;
            }else if(ascii <= 70){
                total += 4;
            }else if(ascii <= 73){
                total += 5;
            }else if(ascii <= 76){
                total += 6;
            }else if(ascii <= 79){
                total += 7;
            }else if(ascii <= 83){
                total += 8;
            }else if(ascii <= 86){
                total += 9;
            }else{
                total += 10;
            }
        }
        System.out.println(total);
    }
}
