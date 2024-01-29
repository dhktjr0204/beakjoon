import java.util.StringTokenizer;

public class JadenCase {
    public String solution(String s) {
        s=s.toLowerCase();
        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()){
            String word=st.nextToken();
            if (word.equals(" ")){
                sb.append(word);
            }else{
                sb.append(word.substring(0,1).toUpperCase()+word.substring(1));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        JadenCase jadenCase = new JadenCase();
        System.out.println(jadenCase.solution("3people unFollowed me"));
    }
}
