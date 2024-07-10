package week2;

import java.util.*;
public class A032_ParkEunju_20240710 {

	public static void main(String args[]) {
		//A032 부녀회장이 될테야 		
	Scanner s = new Scanner(System.in);

        int[][] count = new int[15][15];
        for(int a=0; a<15; a++){
           count[a][1]=1; // 모든 층의 1호는 1이다 
           count[0][a] = a; // 0층 값. 0호는 없으니까 이렇게 a를 넣어줘도 1층부터 넣어주게됨. 
        }
        
        for(int i=1; i<15; i++){ // 1층 - 14층 
            for(int j=2; j<15; j++){ // 2호 - 14호
                count[i][j] = count[i][j-1]+count[i-1][j]; // (i층의 j-1호 값) + (i-1층의 j호) = i층 j호  
            }
        }
        
        int t = s.nextInt(); // test case 
        int[] answers = new int[t];
        for(int i=0; i<t; i++){ // test case만큼 반복
            
            int k = s.nextInt();//층 k 
            int n = s.nextInt(); // 호 n
             answers[i]=count[k][n];  
        }
 for(int i=0; i<t; i++)System.out.println(answers[i]); //정답 출력 
        
  
	   
       
	}
}
