package silver;

import java.io.*;
import java.util.*;

public class num10709 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] sky = new String[n];

        for (int i = 0; i < n; i++) {
            sky[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int cloud = -1;
            for (int j = 0; j < m; j++) {
                if(sky[i].charAt(j) == 'c') {
                    sb.append("0 ");
                    cloud = 0;
                }else{
                    if(cloud != -1) {
                        cloud++;
                    }
                    sb.append(cloud).append(" ");
                }
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}