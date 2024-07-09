package week2;
import java.util.Scanner;
public class A017_ParkEunju_20240709 {

	   public static void main(String args[]){
	       // A017 방 번호 문제 
	       Scanner s = new Scanner(System.in);
	       
	       int num = s.nextInt(); // 입력받은 숫자 
	       int [] arr = new int[10]; // 1~9까지 몇개가 필요한지 저장할 배열 공간 생성 
	       int max=-1;
	       for(int i=num; i>=1; i/=10){  // 한 사이클 돌때마다 10씩 나눔 => 9999였으면 그 다음번에는 999, 그다음은 99 .. 
	          if(i%10==6) arr[9]++; // 6이 들어오면  arr[9] ++ 
	          else arr[i%10]++; // 하나씩 숫자 확인해서 각 숫자로 지정된 배열 위치에 +1
	   
	           if((i%10 !=9)&&max<=arr[i%10]) max = arr[i%10]; //max 확인할때는 arr[9]를 제외하고 확인 
	       }
	       int nine = arr[9]/2; // nine은 현재 6과 9를 합친 값을 2로 나눈건데, 이 합한값이 홀수면 +1을 해줘야함. 
	       if(arr[9]%2==1) nine++;
	       	if(max<nine) max = nine;  //나중에 max와 nine 를 비교해서 더 큰 값을 답으로 넣음.
	       	
	       	System.out.println(max);
	   } 
	    
	   
}
