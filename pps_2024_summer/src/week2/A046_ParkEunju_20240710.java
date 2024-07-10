package week2;

import java.util.*;
public class A046_ParkEunju_20240710 {

	
	public static void main(String args[]) {
		//A046 농구경기
		Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine());
        String [] names = new String[N];
        int[] alphabet = new int[26]; // 알파벳 몇개 나오는지 세기 위해서 개수 저장할 배열 선언 
        for(int i = 0; i<N; i++){
            names[i] = s.nextLine();
            char c = names[i].charAt(0); // 각 이름의 첫 알파벳 
            alphabet[c-'a']++; // 현재 알파벳 ascii-97 하면 0~26까지 범위 사이로 들어가게 됨. 
            // System.out.println("name: "+ names[i]);
            // System.out.println("alphabet: "+alphabet[c-97]);
      
        }
        
        boolean exist = false;
        for(int i=0; i<26; i++) {
    	   if(alphabet[i]>=5) {
    		   System.out.printf("%c",i+'a'); // ascii 코드로 소문자 알파벳은 97 더해야 나오므로  
    		   exist = true;
    	   }
    	   
       }
       if(exist == false) System.out.println("PREDAJA");
	}
}
