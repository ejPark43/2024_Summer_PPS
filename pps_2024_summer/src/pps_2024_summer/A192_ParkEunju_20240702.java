package pps_2024_summer;

import java.util.Scanner;

public class A192_ParkEunju_20240702 {

public static void main(String args[]) {
	

//1~n 합 
Scanner s = new Scanner(System.in);
String input = s.next();
int n = Integer.valueOf(input);
int ans = 0;
for(int i=1; i<=n; i++){
ans +=i;   
}
System.out.println(ans);


	
}
}
