public class Solution {

    public void printProbablity(int n) {
        if(n<1){
            return;
        }
        int[] point=new int[6*n+1];
        for(int i=1;i<=6;i++){
            point[i]=1;
        }
        for(int i=2;i<=n;i++){
            int[] point2=new int[6*n+1];
            for(int j=i;j<=6*i;j++){
                for(int k=1;k<=j&&k<=6;k++){
                    point2[j]+=point[j-k];
                }
            }
            point=point2;
        }
        double total=Math.pow(6,n);
        for(int i=n;i<=6*n;i++){
            System.out.format("The probility of point "+i+" is %2.2f%%\n",(((double)point[i])/total)*100);
        }
    }
}