package week2;
import java.util.*;
public class A104_ParkEunju_20240710 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int n = Integer.parseInt(s.nextLine()); // n 
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
       
        }
        Arrays.sort(arr); // 작은수->큰수 순서대로 sort
        int sum=0;
        for(int i=0; i<n-1; i++){ // n개 마을을 돌때, 순환하지 않고 한쪽에서 시작해서 한쪽으로 끝나려면 n-1이어도 됨. 
        	//즉 최소 비용은 가장 큰 비용이 드는 곳을 거치지 않고 다른 나머지 마을 가는 비용을 더하면 된다. 
            sum+=arr[i]; // 
        }
        System.out.println(sum);
        
    }
	
	
}
