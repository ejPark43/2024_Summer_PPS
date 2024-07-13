package week2;

import java.util.*;
public class A187_ParkEunju_20240712 {

	public static void main(String args[]) {
		//A187 윤년계산 
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();
		
        // "4의 배수이면서 100의 배수가 아닐 때" 혹은 "400의 배수일때" 
        if((y%4==0)&&(y%100!=0) ||y%400==0) System.out.println("1"); 
		else System.out.println("0");
		
		
	}
	
}
