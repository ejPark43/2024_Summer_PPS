package pps_2024_summer;
import java.util.Scanner;
public class A020_ParkEunju_20240706 {
	  public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	int max=0; 
			int[] counts = new int [6];
			int sum = s.nextInt();
			max = sum;
			for(int i=0; i<6; i++){
			    if(i%2==0){
			    sum+=s.nextInt();
			    }
			    else{
			    sum-=s.nextInt();
			    }
			    counts[i] = sum;
			    if(counts[i]>=max) max = counts[i];
			}
			System.out.println(max);
	    }
}
