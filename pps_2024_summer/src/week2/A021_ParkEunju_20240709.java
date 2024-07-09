package week2;
import java.util.*;
public class A021_ParkEunju_20240709 {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); //맨 처음 N 
		int sum = 0; // 연결가능한 컴퓨터 개수 
        for(int i=0; i<n; i++){
         sum+=s.nextInt();   // 각 멀티탭의 플러그 수를 다 더함 
        }
        System.out.println(sum-(n-1)); //마지막 멀티탭을 제외한 각 멀티탭마다 한 플러그는 사용할 수 없다. 즉, n-1개의 플러그는 사용불가함. 
        //=> 답은 모든 플러그 더한 수 - (n-1) 
		
	}
}
