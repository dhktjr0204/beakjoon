package silver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class num11478 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        Map<String, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                map.put(s.substring(i,j+1),1);
            }
        }

        System.out.println(map.size());
    }
}
