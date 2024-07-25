package week4;

import java.util.*;
import java.math.BigInteger;
public class B077_ParkEunju_20240725 {
//B077 피보나치 수열 

public static void main(String args[]) {
	
	Scanner s = new Scanner(System.in);
	int n = Integer.parseInt(s.nextLine());// 입력받을 정수 
	BigInteger[] dp = new BigInteger[n+1]; // 저장하게될 숫자가 엄청 커지기 때문에 BigInteger로 만듦.
	
	dp[0] = BigInteger.valueOf(0);
	dp[1] = BigInteger.valueOf(1);

if(n>1) dp[2] = BigInteger.valueOf(1);
for(int i =3; i<=n;i++) {
	dp[i] = dp[i-1].add(dp[i-2]);
}

System.out.println(dp[n]);
}
	
}
