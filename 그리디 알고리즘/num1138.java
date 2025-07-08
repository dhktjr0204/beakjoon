package silver;

import java.io.*;
import java.util.*;

public class num1138 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n =Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] people = new int[n];
        for(int i=0; i<n; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }

        int[] line = new int[n];
        for(int i=0; i<n; i++) {
            int tallerLeft = people[i];
            int count = 0;
            for(int j=0; j<n; j++) {
                if(line[j] == 0) {
                    if(count == tallerLeft) {
                        line[j] = i+ 1;
                        break;
                    }
                    count++;
                }
            }
        }

        for (int x : line) {
            System.out.print(x + " ");
        }
    }
}
