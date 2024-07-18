package week3;

import java.util.*;
public class A139_ParkEunju_20240718 {
//A139 뒤집기 (0001001 -> 0000000 혹은 1111111 둘중 하나로 만드는데 더 최소인 경우수 구하기 ) 
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		  StringTokenizer st1 = new StringTokenizer(str, "0"); 
	        StringTokenizer st0 = new StringTokenizer(str, "1"); 

	        System.out.println(Math.min(st1.countTokens(), st0.countTokens())); // 연속된 토큰이 몇개인지 세서 둘중에 어떤수가 더 작은지 == 최소 뒤집는 수  

		
	}
}
