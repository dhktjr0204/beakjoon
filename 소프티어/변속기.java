package softeer;
import java.io.*;
import java.util.*;

public class 변속기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int pre=Integer.parseInt(st.nextToken());
        int start=pre;

        String answer="";
        for(int i=1; st.hasMoreTokens(); i++){
            if(start!=1 && start!=8){
                answer="mixed";
                break;
            }

            int current=Integer.parseInt(st.nextToken());

            if(current-pre==1){
                pre=current;
                if(answer.length()!=0 && !answer.equals("ascending")){
                    answer="mixed";
                    break;
                }

                answer="ascending";
            }else if(current-pre==-1){
                pre=current;

                if(answer.length()!=0 && !answer.equals("descending")){
                    answer="mixed";
                    break;
                }
                answer="descending";
            }else{
                answer="mixed";
                break;
            }
        }
        System.out.println(answer);
    }
}
