package week4;

import java.util.*;
public class B035_ParkEunju_20240725 {
	// B035 동전 0 
	public static void main(String args[]) {
	
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k= s.nextInt();
		
		int[] coins = new int[n];
		
		for(int i = 0; i < n; i++) {
			coins[i] = s.nextInt();
		}
		
		int count = 0;
 
		for(int i = n - 1; i >= 0; i--) {
 
			// 현재 동전의 가치가 K보다 작거나 같아야지 구성가능하다.
			if(coins[i] <= k) {
				// 현재 가치의 동전으로 구성할 수 있는 개수를 더해준다.
				count += (k / coins[i]);
				k = k % coins[i];
			}
		}
		System.out.println(count);
	}
}
