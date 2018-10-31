import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		ArrayList<Integer> cakes=new ArrayList<>();
		for(int i=0;i<n;i++) {
			cakes.add(sc.nextInt());
		}
		sc.close();
		int count=0;
		int tmp=k;
		while(cakes.size()>0) {
			while(k>0) {
				int cake=cakes.remove(0);
				k-=cake;
				if(cakes.size()==0) {
					break;
				}
			}
			count++;
			k=tmp;
		}
		System.out.println(count);
	}
}