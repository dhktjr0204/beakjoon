import java.io.*;
import java.util.*;

public class num1991 {
    static Node tree=new Node('A',null,null);
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            char node=st.nextToken().charAt(0);
            char left_child=st.nextToken().charAt(0);
            char right_child=st.nextToken().charAt(0);
            insertNode(tree,node, left_child, right_child);
        }
        preOrder(tree);
        System.out.println();
        inOrder(tree);
        System.out.println();
        postOrder(tree);
        System.out.println();
    }
    static class Node{
        char value;
        Node left;
        Node right;
        public Node(char value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    public static void insertNode(Node node,char root, char left, char right){
        //이미 노드가 생성되었다면(루트 노드라면)
        if(node.value==root){
            node.left=(left=='.'? null:new Node(left,null,null));
            node.right=(right=='.'?null:new Node(right,null,null));
        }//아니라면 자식 노드로 이동
        else{
            if(node.left!=null) insertNode(node.left ,root, left, right);
            if(node.right!=null) insertNode(node.right ,root, left, right);
        }
    }
    public static void preOrder(Node n){
        if (n==null){
            return;
        }
        System.out.print(n.value);
        preOrder(n.left);
        preOrder(n.right);
    }

    public static void inOrder(Node n){
        if(n==null){
            return;
        }
        inOrder(n.left);
        System.out.print(n.value);
        inOrder(n.right);
    }

    public static void postOrder(Node n) {
        if(n==null){
            return;
        }
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.value);
    }
}
