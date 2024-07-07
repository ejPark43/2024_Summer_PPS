package pps_2024_summer;
import java.util.Scanner;
public class A047_ParkEunju_20240706 {
	  public static void main(String args[]){
	        
		   Scanner s = new Scanner(System.in);
		      
		      String word = s.next();
		      int length = word.length();
		        for(int i=length; i>=1; i-=10){
		            if(word.length()<10) System.out.println(word);
		            else{
		        System.out.println(word.substring(0, 10));
		        word = word.substring(10);
		        }
		        }
		     
       
   }
}
