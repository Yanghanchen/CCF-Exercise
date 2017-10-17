import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] nums=new int[N];
		for(int i=0;i<N;i++) {
			nums[i]=sc.nextInt();
		}
		ArrayList<Integer> op2=new ArrayList<>();
		for(int i=0;i<M;i++) {
			int type=sc.nextInt();
			if(type==1) {
				int l=sc.nextInt();
				int r=sc.nextInt();
				int v=sc.nextInt();
				if(l==r) {
					continue;
				}
				for(int j=l-1;j<r;j++) {
					if(nums[j]%v==0)
						nums[j]/=v;
				}
			}else {
				int l=sc.nextInt();
				int r=sc.nextInt();
				if(l==r) {
					op2.add(0);
				}else {
					int count=0;
					for(int j=l-1;j<r;j++) {
						count+=nums[j];
					}
					op2.add(count);
				}
			}
		}
		for(int a:op2) {
			System.out.println(a);
		}
		sc.close();
	}
}