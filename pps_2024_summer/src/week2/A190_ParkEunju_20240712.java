package week2;

import java.util.*;
public class A190_ParkEunju_20240712 {
//A190 주사위 세개 
	
	public static void main(String args[]) {
	
	Scanner s = new Scanner(System.in);
	int a = Integer.parseInt(s.next());
	int b = Integer.parseInt(s.next());
	int c = Integer.parseInt(s.next());
	int max = Math.max(a, b);
	 max=Math.max(max, c);
	if(a!=b && b!=c && c!=a) {// 셋다 다른 경우 
		System.out.println(max*100);
		
	}
	else if(a==b&&b==c) { // 셋다 같은 경우 
		System.out.println(10000+a*1000);
	}
	else {//둘만 같은 경우
		if(a==b) System.out.println(a*100 + 1000);
	else if(b==c) System.out.println(b*100 + 1000);
	else System.out.println(c*100 + 1000);
	}
		
	}
}
