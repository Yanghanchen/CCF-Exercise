public class Main{
    static int result=Integer.MAX_VALUE;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] attack=new int[N];
        for(int i=0;i<N;i++){
        	attack[i]=sc.nextInt();
        }
        int[] nums=new int[N];
        for(int i=0;i<N;i++){
        	nums[i]=sc.nextInt();
        }
        ArrayList<Integer> xiaoq=new ArrayList<>(2);
        xiaoq.add(nums[0]);
        xiaoq.add(attack[0]);
        maoxian(attack,nums,xiaoq,1,N);
        System.out.println(result);
	}
	private static void maoxian(int[] attack, int[] nums, ArrayList<Integer> xiaoq, int i, int n) {
		if(i==n-1){
			if(xiaoq.get(1)<attack[i]){
				int coin=xiaoq.get(0)+nums[i];
				result=result>coin?coin:result;
			}else{
				int coin=xiaoq.get(0);
				result=result>coin?coin:result;
			}
		}else{
			if(xiaoq.get(1)>=attack[i]){
				maoxian(attack,nums,xiaoq,i+1,n);
			}
				ArrayList<Integer> xiaoq2=new ArrayList<>(xiaoq);
				xiaoq2.set(0, xiaoq2.get(0)+nums[i]);
				xiaoq2.set(1, xiaoq2.get(1)+attack[i]);
				maoxian(attack,nums,xiaoq2,i+1,n);
		}
	}

}