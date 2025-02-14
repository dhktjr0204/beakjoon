package softeer;
import java.io.*;
import java.util.*;


public class 연탄의크기 {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());

        int[] briquettes=new int[n];
        for(int i=0;i<n;i++){
            briquettes[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(briquettes);

        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=2;i<=briquettes[briquettes.length-1]; i++){
            for(int briquette: briquettes){
                if(briquette%i==0){
                    map.put(i, map.getOrDefault(i, 0)+1);
                }
            }
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());

        Collections.sort(keySet, (a,b) -> map.get(b)- map.get(a));

        System.out.println(map.get(keySet.get(0)));
    }
}
