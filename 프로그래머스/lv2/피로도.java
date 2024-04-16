public class 피로도 {
    static boolean[] visited;
    static int count;
    public int solution(int k, int[][] dungeons) {
        visited=new boolean[dungeons.length];
        dfs(0,k,dungeons);
        return count;
    }
    public void dfs(int depth,int fatigue, int[][] dungeons){
        for (int i=0; i<dungeons.length;i++){
            if (visited[i] || fatigue<dungeons[i][0]){
                continue;
            }
            visited[i]=true;
            dfs(depth+1,fatigue-dungeons[i][1],dungeons);
            visited[i]=false;
        }
        count=Math.max(depth,count);
    }

    public static void main(String[] args) {
        피로도 tired = new 피로도();
        System.out.println(tired.solution(80,new int[][]{{80,20},{50,40},{30,10}}));
    }
}
