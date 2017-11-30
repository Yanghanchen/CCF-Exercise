import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static boolean[][] isVisited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		HashMap<Integer, ArrayList<Integer>> send = new HashMap<>(N + 1);
		HashMap<Integer, ArrayList<Integer>> receive = new HashMap<>(N + 1);
		for (int i = 0; i < N+1; i++) {  
			send.put(i,new ArrayList<Integer>());  
			receive.put(i,new ArrayList<Integer>());    
        }  
		isVisited = new boolean[N + 1][N + 1];
		for (int i = 0; i < N + 1; i++) {
			isVisited[i][i] = true;
		}

		for (int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			send.get(s).add(t);
			receive.get(t).add(s);
		}
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i < send.size(); i++) {
			queue.add(i);
			boolean[] tmpvistit = new boolean[N + 1];
			while (!queue.isEmpty()) {
				int now = queue.poll();
				if (!tmpvistit[now]) {
					for (int j = 0; j < send.get(now).size(); j++) {
						int next = send.get(now).get(j);
						queue.add(next);
					}
					tmpvistit[now] = true;
					isVisited[i][now] = true;
				}
			}
		}
		for (int i = 1; i < send.size(); i++) {
			queue.add(i);
			boolean[] tmpvistit = new boolean[N + 1];
			while (!queue.isEmpty()) {
				int now = queue.poll();
				if (!tmpvistit[now]) {
					for (int j = 0; j < receive.get(now).size(); j++) {
						int next = receive.get(now).get(j);
						queue.add(next);
					}
					tmpvistit[now] = true;
					isVisited[i][now] = true;
				}
			}
		}
		int count = 0;
		for (int i = 1; i < isVisited.length; i++) {
			boolean AllVisited = true;
			for (int j = 1; j < isVisited[i].length; j++) {
				if (!isVisited[i][j]) {
					AllVisited = false;
					break;
				}
			}
			if (AllVisited)
				count++;
		}
		System.out.println(count);
		sc.close();
	}
}