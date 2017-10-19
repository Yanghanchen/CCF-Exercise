import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		HashMap<Integer, ArrayList<Integer>> send = new HashMap<>();
		HashMap<Integer, ArrayList<Integer>> receive = new HashMap<>();
		// initialize
		for (int i = 1; i <= N; i++) {
			ArrayList<Integer> sendList = new ArrayList<>();
			sendList.add(i);
			ArrayList<Integer> rcvList = new ArrayList<>();
			rcvList.add(i);
			send.put(i, sendList);
			receive.put(i, rcvList);
		}

		for (int i = 0; i < M; i++) {
			int start = sc.nextInt();
			int dest = sc.nextInt();
			send.get(start).add(dest);
			receive.get(dest).add(start);
		}
		
		int count = 0;
		for (int i = 1; i <= N; i++) {
			ArrayList<Integer> sendList = send.get(i);
			for(int a=0;a<sendList.size();a++) {
				if(sendList.size()==N) {
					count++;
					break;
				}
				int t=sendList.get(a);
				if(t==i) {
					continue;
				}
				ArrayList<Integer> sendtemp=send.get(t);
				for(int b:sendtemp) {
					if(!sendList.contains(b)) {
						sendList.add(b);
					}
				}
			}
			ArrayList<Integer> rcvList = receive.get(i);
			for(int a=0;a<rcvList.size();a++) {
				if(rcvList.size()==N) {
					count++;
					break;
				}
				int t=rcvList.get(a);
				if(t==i) {
					continue;
				}
				ArrayList<Integer> rcvtemp=receive.get(t);
				for(int b:rcvtemp) {
					if(!rcvList.contains(b)) {
						rcvList.add(b);
					}
				}
			}
		}		
		System.out.println(count);
		sc.close();
	}
}