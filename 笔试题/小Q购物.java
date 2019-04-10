public class Main{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        int[] coins=new int[n];
        for(int i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        Arrays.sort(coins);
        if(coins[0]!=1){
            System.out.println(-1);
            return;
        }else{
            int sum=1,cnt=0;
            while(true){
                if(sum>=m){
                    System.out.println(cnt);
                    return;
                }else{
                    for(int i=n-1;i>=0;i--){
                        if(coins[i]<=sum){
                            cnt++;
                            sum+=coins[i];
                            break;
                        }
                    }
                }
            }
        }
    }
}