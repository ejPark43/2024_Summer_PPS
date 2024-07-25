package week4;

import java.util.*;
public class B075_ParkEunju_20240725 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int [] dp = new int[100001];
		//각 동전을 가장 적게 쓰면서 만들 수 있는 경우들 
		dp[1] = 1;// 1 
		dp[2] = 1; // 2
		dp[3] = 2; // 1+2, 2+1 
		dp[4] = 2; // 2+2
		dp[5] = 1; // 5 
		dp[6] = 2; // 5+1, 1+5 
		dp[7] = 1; // 7 
		for(int i =8; i<=n; i++) {
			dp[i] = Math.min(dp[i-1],Math.min(dp[i-2],Math.min(dp[i-5],dp[i-7])))+1;
		} 
		System.out.println(dp[n]);
		
		
	}
}
