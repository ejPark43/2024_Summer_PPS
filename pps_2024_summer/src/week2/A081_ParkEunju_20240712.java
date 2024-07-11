package week2;
import java.util.*;
public class A081_ParkEunju_20240712 {
	  public static void main(String args[]){
		  //A081 N번째 큰 수 
	        Scanner s = new Scanner(System.in);
	        int n = Integer.parseInt(s.nextLine());
	        int[] arr = new int[10]; //각 줄에있는 원소 10개가 여기 저장됨 
	        int[] ans = new int[n]; // 정답 출력용 배열 
	        for(int i = 0; i<n; i++){
	            for( int j=0; j<10; j++){
	                arr[j]=Integer.parseInt(s.next());
	            }
	            Arrays.sort(arr); // 10개 원소를 sort 
	            ans[i] = arr[7]; // 7번째 들어있는 원소가 3번째로 크므로 ans[i]에 넣어준다 
	        }
	        for(int i=0; i<n; i++){
	            System.out.println(ans[i]);
	        }
	    }
	
	
}
