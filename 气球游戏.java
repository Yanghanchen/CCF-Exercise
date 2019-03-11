import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] data = new int[n];
        int[] colors=new int[m+1];
        int count=0;
        Queue<Integer> queue=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
            if(data[i]==0){
                continue;
            }
            queue.offer(data[i]);
            colors[data[i]]++;
            if(colors[data[i]]==1) {
                count++;
            }
            while(colors[queue.peek()]>1){
                colors[queue.peek()]--;
                queue.poll();
            }
            if(count==m){
                System.out.println(queue.size()==1000000000?-1:queue.size());
                break;
            }
        }
    }
}