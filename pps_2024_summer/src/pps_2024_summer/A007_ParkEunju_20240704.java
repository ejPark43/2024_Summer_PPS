package pps_2024_summer;
import java.util.Scanner;
public class A007_ParkEunju_20240704 {
	  public static void main(String args[]){
		  Scanner s = new Scanner(System.in);
		  		int[] input = new int[8];
		  		String print= "";
		  		for(int i =0; i<input.length; i++) input[i] = s.nextInt();
		  		
		  		for(int i=1; i<input.length; i++) {
		  			if(input[i-1]== input[i] +1) {print = "descending";}
		  			else if(input[i-1]== input[i] -1) {print = "ascending";}
		  			else {print = "mixed"; break;}
		  		}
		  		
		  		System.out.println(print);
		          
		      }
}
