package week2;

import java.util.*;
public class A188_ParkEunju_20240712 {
//A188 사분면 고르기 
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
        int x = Integer.parseInt(s.nextLine());
        int y = Integer.parseInt(s.nextLine());
        
        if(x>0&&y>0)System.out.println("1"); // 둘다 양수 
        else if(x>0) System.out.println("4"); // x만 양수 
        else if(y>0) System.out.println("2"); // y만 양수 
        else System.out.println("3"); // 둘다 음수 
   
        
	}
}
