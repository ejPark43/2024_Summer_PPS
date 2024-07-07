package pps_2024_summer;
import java.util.Scanner;
public class A186_ParkEunju_20240704 {

	 public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        int score = s.nextInt();
	        if(score>=90) System.out.println("A");
	        else if(score>=80)System.out.println("B");
	        else if(score>=70)System.out.println("C");
	        else if(score>=60)System.out.println("D");
	        else System.out.println("F");
	    }
}
