package week3;

import java.util.*;
public class A125_ParkEunju_20240716 {
	//A125 로프 (견딜수있는 최대 중량구하기)
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		int n = Integer.parseInt(s.nextLine()); // test case
		Integer[] arr = new Integer[n];
		for(int i =0; i<n; i++) {
			arr[i] = Integer.parseInt(s.nextLine());
		}
		Arrays.sort(arr,Collections.reverseOrder()); // 내림차정렬 
		
		int sum = 0;
		for(int i = 0; i<n; i++) {
			sum = Math.max(sum, arr[i]*(i+1)); //최대 중량은 병렬로 연결된 로프의 중량 중 가장 작은 것 * 병렬 연결된 로프 개수임 
			// 내림차로 정렬한 arr 에서 하나씩 돌아가면서 큰수부터 작은수까지 중량 확인하고 계산한 뒤 더 큰값을 sum에 집어넣음 
		}
		System.out.println(sum);
	}
	
}
