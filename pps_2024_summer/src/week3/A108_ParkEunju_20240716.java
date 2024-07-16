package week3;

import java.util.*;
public class A108_ParkEunju_20240716 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int n = Integer.parseInt(s.nextLine());// test case 
		
		String[] ans = new String[n];
		for(int i =0; i<n; i++) {
			String reverse = ""; 
			String base =  s.nextLine();
			for(int j=base.length()-1; j>=0; j--) {
				reverse +=base.charAt(j); // 거꾸로 뒤집은 문자열 생성  
			}
			int sum = Integer.parseInt(base)+Integer.parseInt(reverse);
			String sumStr = Integer.toString(sum);
			boolean yn=false;
			for(int k=0; k<=sumStr.length()/2; k++) {
				if(sumStr.charAt(k) != sumStr.charAt(sumStr.length() - k-1) ) // 만약 왼쪽, 오른쪽 각 끝부분부터 가운데로 가기까지 부분이 같지 않으면 return false; 
				{
					yn=false;
				
					break;
				}
				else yn=true;
				
			}
			if(yn==false) 	ans[i] = "NO";
			else ans[i]="YES";
			
			
		}
		for(int i=0; i<n; i++)
		System.out.println(ans[i]);
	}

}

