package week3;

import java.util.*;
public class A110_ParkEunju_20240716 {
	//A110 거스름돈 
	public static void main(String args[]) {	
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int count=0;
		int[] coins = {500,100,50,10,5,1};
		n = 1000-n;
	for(int i=0; i<6; i++) {// 500, 100, 50, 10, 5, 1을 확인하도록 6번 반복 
	count += n/coins[i]; // n 나누기 각 코인 값 = n을 만들때 사용될수있는 해당 코인 개수 
		n%=coins[i];// 나머지 가지고 또 그다음 코인들 계산 
	}
	System.out.println(count);
	}
}
