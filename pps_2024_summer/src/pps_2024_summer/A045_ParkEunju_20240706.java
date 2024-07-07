package pps_2024_summer;
import java.util.Scanner;
public class A045_ParkEunju_20240706 {
	public static void main(String args[]){
		
	     Scanner s = new Scanner(System.in);
	        String word = s.next();
	     
	        word = word.toUpperCase();
	       
	        String[] word_chars = word.split("");
	        int[] alphabetCount = new int[26];
	      
	        for(int i=0; i<word.length(); i++){
	             alphabetCount[word_chars[i].charAt(0) - 65] ++;
	            
	        }
	       
	       int max=-100; 
	       char result = '?';
	for(int i=0; i<26; i++){
	
	    if(max==alphabetCount[i])   { 
	    	result = '?';
	    
	    	}
	  if(alphabetCount[i]>max) {
	    	max = alphabetCount[i];
	    	result = (char)(i+'A');
	    			}
	}    

	System.out.println(result);
   }
}
