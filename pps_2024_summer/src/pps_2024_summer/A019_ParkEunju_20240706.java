package pps_2024_summer;
import java.util.Scanner;
public class A019_ParkEunju_20240706 {
	 public static void main(String args[]){
	       Scanner s = new Scanner(System.in);
			        int num =0; 
			        num = s.nextInt();
			        num *=s.nextInt();
			        num *=s.nextInt();
			        
			        int[] numbers = new int[10];
			        
			        do{
			         numbers[num%10] +=1;
			            if(num>=1)
			            num = num/10;
			           else break;
			        }while(num>=1);
			        
			        for(int i=0; i<=9; i++) {
			        	System.out.println(numbers[i]);
			        }
	    }
}
