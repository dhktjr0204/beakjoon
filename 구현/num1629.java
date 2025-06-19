package silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num1629 {
    static int c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        System.out.println(dac(a,b));
    }

    public static long dac(int a, int b) {
        if(b == 1) {
            return a%c;
        }
        long temp = dac(a,b/2);
        if (b % 2 == 0) {
            return (temp * temp) % c;
        } else {
            return ((temp * temp) % c * a) % c;
        }
    }
}