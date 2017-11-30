import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] nums = new int[100001];
		for (int i = 1; i <= N; i++) {
			nums[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			int type = sc.nextInt();
			if (type == 1) {
				int l = sc.nextInt();
				int r = sc.nextInt();
				int v = sc.nextInt();
				if (v == 1) {
					continue;
				}
				for (int j = l; j <= r;j++) {
					if (nums[j] >= v)
						if(nums[j] % v == 0)
							nums[j] /= v;
				}
			} else if (type == 2) {
				int l = sc.nextInt();
				int r = sc.nextInt();
				long count = 0;
				for (int j = l; j <= r; j++) {
					count += nums[j];
				}
				System.out.println(count);
			}
		}
		sc.close();
	}
}