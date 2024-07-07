package pps_2024_summer;
import java.util.Scanner;
public class A008_ParkEunju_20240704 {
	 public static void main(String args[]){
     	
			Scanner s = new Scanner(System.in);
	        int n = s.nextInt(); // 총 row 
	        float [] average = new float[n];
	     
	        int m=0;
	        float [] answers=new float[n];
	        for(int i=0; i<n; i++){
	        	int count=0;
	            m = s.nextInt(); // 학생 숫자들 
	            int[] scores = new int[m];
	            int avg = 0;
	            for(int j =0; j<m; j++){
	            	scores[j]=s.nextInt();

	            	avg+=scores[j];
	            }
	            average[i] =((float)avg/(float)m);
	            
	            for(int j=0; j<m; j++) {
	            	if(average[i] < scores[j]) count++;
	            }
	            answers[i] = (float) (((float)count/(float)m)*100.0);
	        }
	        
	        for(int k=0; k<n; k++){

	            System.out.printf("%.3f%%\n",answers[k]);
	        }        
			
	    }
}
