import java.util.*;
import java.util.Comparator;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // ext와 sort_by의 값은 "code", "date", "maximum", "remain" 중 하나
        String[] classArr = new String[]{"code", "date", "maximum", "remain"};

        // 1. ext, sort_by의 열 인덱스 찾기 // (== 아니고 equals)
        int extIdx = -1, sortIdx = -1;
        int i = 0;
        while (i < classArr.length) {
            if (classArr[i].equals(ext)) extIdx = i;
            if (classArr[i].equals(sort_by)) sortIdx = i;
            i++;
        }

        // 2. data[r][extIdx] < val_ext 인 행만 넣기
        List<int[]> bucket = new ArrayList<>();
        for (int r = 0; r < data.length; r++) {
            if (data[r][extIdx] < val_ext) {
                bucket.add(data[r]);
            }
        }

        // 3. 결과 배열로 변환
        int[][] resultData = bucket.toArray(new int[bucket.size()][]);
        
        // 4. 정렬 sort_by 열 기준 오름차순
        Arrays.sort(resultData, new ColumnComparator(sortIdx));

        return resultData;
    }


    public class ColumnComparator implements Comparator<int[]> {
    private int sortIdx;

    // 어떤 열을 기준으로 정렬할지 생성자로 받는다
    public ColumnComparator(int sortIdx) {
        this.sortIdx = sortIdx;
    }

    @Override
    public int compare(int[] row1, int[] row2) {
        return Integer.compare(row1[sortIdx], row2[sortIdx]);
    }
}

}
