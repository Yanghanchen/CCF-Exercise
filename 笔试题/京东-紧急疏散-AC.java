import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<TreeNode> guanzhong=new ArrayList<>();
        for(int i=1;i<=n;i++){
            guanzhong.add(new TreeNode(i));
        }
        for(int i=1;i<n;i++){
            int x=sc.nextInt(),y=sc.nextInt();
            guanzhong.get(y-1).sons.add(guanzhong.get(x-1));
        }
        int count=0;
        for(TreeNode node:guanzhong.get(0).sons){
            int tmp=0;
            Stack<TreeNode> stack=new Stack<>();
            stack.push(node);
            while(!stack.empty()){
                TreeNode tmpNode=stack.pop();
                for(TreeNode son:tmpNode.sons){
                    stack.push(son);
                }
                tmp++;
            }
            count=tmp>count?tmp:count;
        }
        System.out.println(count);
    }

    static class TreeNode{
        int val;
        ArrayList<TreeNode> sons=new ArrayList<>();

        public TreeNode(int val) {
            this.val = val;
        }
    }
}