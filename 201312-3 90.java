import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] lengths=new int[n];
		int[] aaa=new int[n];
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			lengths[i]=a;
			aaa[i]=a;
		}
		ArrayList<Integer> mianji=new ArrayList<>();
		for(int i=0;i<n;i++) {
			mianji.add(lengths[i]);
		}
		Arrays.sort(lengths);
		int max=0;
		
		for(int i=0;i<n;i++) {
			int num=aaa[i];
			int zuoweizhi=findzuo(aaa,num);
			int youweizhi=findyou(aaa,num);
			int mj=(youweizhi-zuoweizhi)*num;
			max=max<mj?mj:max;
		}
		System.out.println(max);
		sc.close();
	}
	private static int findyou(int[] aaa, int num) {
		if(find(aaa, num)==aaa.length) {
			return aaa.length;
		}
		for(int i=find(aaa, num);i<aaa.length;i++) {
			if(aaa[i]<num) {
				return i-1;
			}
		}
		return aaa.length;
	}
	
	private static int findzuo(int[] aaa, int num) {
		if(find(aaa, num)<=0) {
			return 0;
		}
		for(int i=find(aaa, num);i>=0;i--) {
			int now=aaa[i];
			if(now<num) {
				return i;
			}
		}
		return 0;
	}
	
	private static int find(int[] aaa, int num) {
		for(int i=0;i<aaa.length;i++) {
			if(aaa[i]==num) {
				return i;
			}
		}
		return 0;
	}
}