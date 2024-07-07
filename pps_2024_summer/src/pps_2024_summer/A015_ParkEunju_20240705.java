package pps_2024_summer;
import java.util.Scanner;
public class A015_ParkEunju_20240705 {
	 public static void main(String args[]){
         Scanner s = new Scanner(System.in);
         
         int sum = 0;
         
         for(int i=0; i<5; i++){
             sum += Math.pow(s.nextInt(),2);
         }
         System.out.println(sum%10);
         
     }
}
