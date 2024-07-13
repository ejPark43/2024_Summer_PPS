package week2;


import java.util.*;
public class A196_ParkEunju_20240712 {
public static void main(String args[]) {
	//A196  개수 세기 
	Scanner s = new Scanner(System.in);
	
	int n = Integer.parseInt(s.next()); // 정수 개수 
	int[] arr = new int[n]; // 정수들 저장할 배열 
	for(int i=0; i<n; i++) {
	 arr[i]= s.nextInt();
	}
	int find = Integer.parseInt(s.next()); //찾을 정수 
	int count = 0;
	
	for(int i=0; i<n; i++) {
		if(arr[i]==find) count++; // 찾으면 count ++ 
	}
	System.out.println(count); 
}
	
}
