package week2;

import java.util.*;
public class A052_ParkEunju_20240711 {
	
	public static void main(String args[]) {
		
		//A052 OX 퀴즈 
	
		Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine()); // test case
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
             int score = 0;
            int count =0;
            String str = s.next(); // 들어오는 한 줄의 ox 퀴즈 결과 
            for( int j=0; j<str.length(); j++){
                if(str.charAt(j) == 'O') {
                    // 들어온게 O라면 count 증가 
//                score++;
                count++; // O가 들어오면 일단 +1은 무조건 필요함.
                score +=count;  // 현재 count 
                }
                else count=0; //O를 제외한 게 들어왔다면 count=0됨 
                          
            }          
            ans[i] = score;

        }
for(int i=0; i<n; i++)
        System.out.println(ans[i]);
        
	}

}
