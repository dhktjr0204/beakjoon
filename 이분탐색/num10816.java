package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class num10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] sangCard = getCard(n, br.readLine());

        int m=Integer.parseInt(br.readLine());
        int[] numCard = getCard(m, br.readLine());

        Map<Integer,Integer> cardCount =new HashMap<>();
        for(int card: sangCard){
            cardCount.put(card, cardCount.getOrDefault(card, 0)+1);
        }

        Arrays.sort(sangCard);

        Map<Integer,Integer> result =new HashMap<>();
        for(int i=0;i<m;i++){
            int num=numCard[i];
            int st=0;
            int ed=sangCard.length-1;
            while(st<=ed){
                int mid=(st+ed)/2;
                if(sangCard[mid]<num){
                    st=mid+1;
                }else if(sangCard[mid]>num){
                    ed=mid-1;
                }else{
                    result.put(num, cardCount.get(num));
                    break;
                }
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int num :numCard){
            sb.append(result.getOrDefault(num,0)+" ");
        }
        System.out.println(sb);
    }
    public static int[] getCard(int n, String br){
        StringTokenizer st=new StringTokenizer(br);

        int[] card=new int[n];
        for(int i=0;i<n;i++){
            card[i]=Integer.parseInt(st.nextToken());
        }
        return card;
    }
}
