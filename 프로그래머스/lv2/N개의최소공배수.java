public class N개의최소공배수 {
    public int solution(int[] arr) {
        int answer = arr[0]*arr[1]/gcd(arr[0],arr[1]);
        for (int i=2; i<arr.length; i++){
            answer=arr[i]*answer/gcd(answer,arr[i]);;
        }
        return answer;
    }
    public int gcd(int a, int b){
        while (a!=0){
            int temp=a;
            a=b%a;
            b=temp;
        }
        return b;
    }

    public static void main(String[] args) {
        N개의최소공배수 nLcm = new N개의최소공배수();
        System.out.println(nLcm.solution(new int[]{2,6,8,14}));
    }
}
