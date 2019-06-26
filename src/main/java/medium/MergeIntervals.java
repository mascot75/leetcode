package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 *
 * @author mascot
 * @date 2019/6/26 20:03
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 2) {
            return intervals;
        }

//        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<int[]> result = new ArrayList<>();
        int[] temp = intervals[0];
        for (int[] interval : intervals) {
            if (temp[1] < interval[0]) {
                result.add(temp);
                temp = interval;
            } else {
                temp[1] = Math.max(temp[1], interval[1]);
            }
        }
        result.add(temp);

        int[][] arr = new int[result.size()][2];
        result.toArray(arr);
        return arr;
    }

}
