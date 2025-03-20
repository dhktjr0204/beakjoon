package lv0;

public class 여러번뒤집기 {
    public String solution(String my_string, int[][] queries) {
        for(int[] query: queries) {
            my_string = change(my_string, query);
        }

        return my_string;
    }

    public String change(String my_string, int[] queries) {
        String s = my_string.substring(0, queries[0]);
        String mid = my_string.substring(queries[0], queries[1] + 1);

        StringBuffer sb = new StringBuffer(mid);
        mid = sb.reverse().toString();

        String e = my_string.substring(queries[1]+1);

        return s + mid + e;

    }
}
