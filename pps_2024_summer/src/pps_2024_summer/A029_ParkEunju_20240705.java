package pps_2024_summer;
import java.util.Scanner;

public class A029_ParkEunju_20240705 {
	 public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);	
				long n =Long.parseLong(s.next());
				int start =Integer.parseInt(s.next());
				if(n>=6) {
				System.out.println("Love is open door");
				return;
				}
				else
				for(int i=1; i<n; i++) {
					if(start==0) start++;
					else if(start==1) start--;
					System.out.println(start);
				
				}
		    }
}
