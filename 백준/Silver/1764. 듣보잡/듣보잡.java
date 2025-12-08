import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] inputArray = new int[2];

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = Integer.parseInt(input[i]);
        }
        // 3 4

        Set<String> set = new HashSet<>();
        for (int i = 0; i < inputArray[0]; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < inputArray[1]; i++) {
            String word = br.readLine();
            if (set.contains(word)) {
                arrayList.add(word);
            }
        }

        Collections.sort(arrayList);
        
        System.out.println(arrayList.size());
       for (String str : arrayList){
           System.out.println(str);
       }
    }
}
