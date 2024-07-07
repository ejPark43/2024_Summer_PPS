package pps_2024_summer;
import java.util.Scanner;
public class A033_ParkEunju_20240705 {
	   public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	int max = 0;
	int index=0;

	for(int i=0; i<4; i++)
	    max+=s.nextInt();

	    for(int i =1; i<5; i++){
	        int temp=0;
	        for(int j = 0; j<4; j++){
	            temp+=s.nextInt();
	        }
	        if(max<temp){
	            max = temp;
	            index=i;
	                    }
	    }
	System.out.printf("%d %d", index+1, max);
	}
}
