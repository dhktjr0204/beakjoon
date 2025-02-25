package softeer;
import java.io.*;
import java.util.*;

public class 근무시간 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int result=0;

        for(int i=0;i<5;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String[] start=st.nextToken().split(":");
            String[] end=st.nextToken().split(":");

            for(int j=0; j<2; j++){
                int stHour= Integer.parseInt(start[0]);
                int edHour= Integer.parseInt(end[0]);
                int stMinute= Integer.parseInt(start[1]);
                int edMinute= Integer.parseInt(end[1]);

                System.out.println(stHour+":"+stMinute);

                int startMinute=stHour*60 + stMinute;
                int endMinute=edHour*60 + edMinute;

                result += endMinute - startMinute;
            }
        }

        System.out.println(result);
    }
}
