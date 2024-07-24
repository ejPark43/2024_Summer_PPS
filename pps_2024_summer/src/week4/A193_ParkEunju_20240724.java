package week4;

import java.util.Scanner;

public class A193_ParkEunju_20240724 {
	// A193 코딩은 체육과목
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int n = Integer.parseInt(s.nextLine()); // n값 
	String str = "";
	for(int i =1; i<=n/4; i++) {
		str+="long ";
	}
	System.out.println(str +"int");
	
	}
}