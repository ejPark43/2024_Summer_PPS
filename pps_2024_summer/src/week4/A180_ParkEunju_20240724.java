package week4;

import java.util.Scanner;

public class A180_ParkEunju_20240724 {
	//A180 나머지 
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int A = Integer.parseInt(s.next());
	int B = Integer.parseInt(s.next());	
	int C = Integer.parseInt(s.next());	
	
	System.out.println((A+B)%C);
	System.out.println(((A%C) + (B%C))%C);
	System.out.println((A*B)%C);
	System.out.println( ((A%C)* (B%C))%C);
	
	}
}
