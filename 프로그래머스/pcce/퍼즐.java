package pcce;
import java.util.*;
import java.util.Collections.*;

public class 퍼즐 {
    public int solution(int[] diffs, int[] times, long limit) {
        int st = 1;
        int[] sorted = Arrays.stream(diffs)
                .sorted()
                .toArray();
        int ed = sorted[diffs.length -1];

        int level = 0;
        while(st<=ed) {
            int mid = (st + ed) /2;
            long result = getTimes(diffs, mid, times, limit);
            if(result < 0) {
                st = mid + 1;
            }else{
                level = mid;
                ed = mid -1;
            }
        }

        return level;
    }
    public long getTimes(int[] diff, int level, int[] time, long limit) {
        for (int i = 0; i < diff.length; i++) {
            if (diff[i] > level) {
                int prev = (i == 0) ? 0 : time[i-1];

                limit -= time[i] + (diff[i] - level) * (prev + time[i]);
            } else {
                limit -= time[i];
            }
        }
        return limit;
    }
}
