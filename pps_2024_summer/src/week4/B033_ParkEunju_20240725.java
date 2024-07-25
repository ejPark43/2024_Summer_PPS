package week4;

import java.util.Scanner;
public class B033_ParkEunju_20240725 {
//B031 라디오 (동전 문제와 비슷. 5분, 1분, 10초 몇개를 써서 각 경우에 전자레인지 버튼을 최소로 조작하는 방법)
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);	
		int n = Integer.parseInt(s.nextLine());
		
		int a = n/300; // 5분 
		n%=300;
		
		int b = n/60; //1분
		n%=60;
		
        int c = n / 10; // 10초
        n %= 10;
        
        if(n != 0) {
        	System.out.println(-1);
        } else {
        	System.out.println(a+" "+b+" "+c);
        }

	
	}
}
