package week3;

import java.util.*;
public class A148_ParkEunju_20240718 {
//A148 단어의 개수 
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		StringTokenizer arr = new StringTokenizer(str, " "); //StringTokenizer로 공백 무시. 

		System.out.println(arr.countTokens()); // countTokens()로 토큰 확인 = 단어 개수 !! 
	}
}
