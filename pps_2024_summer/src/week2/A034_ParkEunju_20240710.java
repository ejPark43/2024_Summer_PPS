package week2;

import java.util.Scanner;

public class A034_ParkEunju_20240710 {
	
	public static void main(String args[]) {
		//A034 나머지  
	 Scanner s = new Scanner(System.in);
     int[] num = new int[10];

     int count = 0;
     
     for(int i=0; i<10; i++){
         boolean exist = false;
           num[i] = s.nextInt()%42;// 42로 나눈 나머지를 배열에 집어넣음.        
         for(int j=0; j<i; j++){ // 0번부터 i번까지 확인해서 똑같은 숫자가 있다면 exist=true로 설정 
           if(num[i]==num[j]) 
           {
               exist = true;
             break; // 여기서 break 해야 중복되게 안 셀수 있다. 
           }
             else {
                 exist = false;
             }
         }
         if(exist == false) count++;
         
     }
     System.out.println(count);
}
}
