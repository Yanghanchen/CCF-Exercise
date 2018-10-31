import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] keys=new int[N];
		for(int i=0;i<N;i++) {
			keys[i]=i+1;
		}
		int[][] qu=new int[10101][N];
		int[][] huan=new int[10101][N];
		for(int i=0;i<M;i++) {
			int key=sc.nextInt();
			int qutime=sc.nextInt();
			int huantime=sc.nextInt()+qutime;
			qu[qutime][key-1]=1;
			huan[huantime][key-1]=1;
		}
		for(int i=0;i<10100;i++) {
			int[] huanop=huan[i];
			for(int j=0;j<N;j++) {
				if(huanop[j]==1) {
					for(int k=0;k<keys.length;k++) {
						if(keys[k]==0) {
							keys[k]=(j+1);
							break;
						}
					}
				}
			}
			int[] quop=qu[i];
			for(int j=0;j<N;j++) {
				if(quop[j]==1) {
					for(int k=0;k<keys.length;k++) {
						if(keys[k]==(j+1)) {
							keys[k]=0;
							break;
						}
					}
				}
			}
		}
		for(int i=0;i<keys.length;i++) {
			System.out.print(keys[i]+" ");
		}
		System.out.println();
		sc.close();
	}
}