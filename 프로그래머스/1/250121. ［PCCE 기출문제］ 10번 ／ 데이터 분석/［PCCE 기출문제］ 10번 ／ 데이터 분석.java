import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> list = new ArrayList<>();
        int extIdx = 0;
        if (ext.equals("code")) extIdx = 0;
        else if (ext.equals("date")) extIdx = 1;
        else if (ext.equals("maximum")) extIdx = 2;
        else if (ext.equals("remain")) extIdx = 3;
        for (int[] d : data) {
            if (d[extIdx] < val_ext) {
                list.add(d);
            }
        }
        int sortIdx = 0;
        if (sort_by.equals("code")) sortIdx = 0;
        else if (sort_by.equals("date")) sortIdx = 1;
        else if (sort_by.equals("maximum")) sortIdx = 2;
        else if (sort_by.equals("remain")) sortIdx = 3;

        final int idx = sortIdx;
        Collections.sort(list, (a, b) -> Integer.compare(a[idx], b[idx]));

        return list.toArray(new int[0][]);
    }
}