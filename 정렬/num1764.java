package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class num1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        Map<String, Integer> notListenPerson=new HashMap<>();

        for(int i=0;i<n;i++){
            notListenPerson.put(br.readLine(),1);
        }

        List<String> notListenAndNotSeePerson=new ArrayList<>();
        for(int i=0;i<m;i++){
            String person=br.readLine();
            if(notListenPerson.containsKey(person)){
                notListenAndNotSeePerson.add(person);
            }
        }

        Collections.sort(notListenAndNotSeePerson);

        System.out.println(notListenAndNotSeePerson.size());
        for(String person:notListenAndNotSeePerson){
            System.out.println(person);
        }
    }
}
