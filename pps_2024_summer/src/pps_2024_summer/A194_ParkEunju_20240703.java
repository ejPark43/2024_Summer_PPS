package pps_2024_summer;

import java.util.Scanner;

public class A194_ParkEunju_20240703 {
public static void main(String args[]) {
		
    Scanner s = new Scanner(System.in);
    int cases = s.nextInt();
    String[] answers= new String[cases];
    for(int i=0; i<cases; i++){
        int A = s.nextInt();
        int B = s.nextInt();
        answers[i] = A+" + "+B+" = "+(A+B);
    }
    for(int i=0; i<cases; i++){
        System.out.println("Case #"+(i+1)+": "+answers[i]);
    }
	
	}
}
