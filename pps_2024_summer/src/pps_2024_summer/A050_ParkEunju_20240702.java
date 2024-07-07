package pps_2024_summer;
import java.util.Scanner;
public class A050_ParkEunju_20240702 {


public static void main(String args[]) {

	// A050 카이사르 
		    Scanner s = new Scanner(System.in);
		    String str = s.next();  	
		     for (String c: str.split("")){
		    	 
		    	 switch(c) {
		    	 case "D" : c = "A";
		    	 break;
		    	 case  "E": c = "B";
		    	 break;
		    	 case  "F": c = "C";
		    	 break;
		    	 case  "G": c = "D";
		    	 break;
		    	 case  "H": c = "E";
		    	 break;
		    	 case  "I": c = "F";
		    	 break;
		    	 case  "J": c = "G";
		    	 break;
		    	 case  "K": c = "H";
		    	 break;
		    	 case  "L": c = "I";
		    	 break;
		    	 case  "M": c = "J";
		    	 break;
		    	 case  "N": c = "K";
		    	 break;
		    	 case  "O": c = "L";
		    	 break;
		    	 case  "P": c = "M";
		    	 break;
		    	 case  "Q": c = "N";
		    	 break;
		    	 case  "R": c = "O";
		    	 break;
		    	 case  "S": c = "P";
		    	 break;
		    	 case  "T": c = "Q";
		    	 break;
		    	 case  "U": c = "R";
		    	 break;
		    	 case  "V": c = "S";
		    	 break;
		    	 case  "W": c = "T";
		    	 break;
		    	 case  "X": c = "U";
		    	 break;
		    	 case  "Y": c = "V";
		    	 break;
		    	 case  "Z": c = "W";
		    	 break;
		    	 case  "A": c = "X";
		    	 break;
		    	 case  "B": c = "Y";
		    	 break;
		    	 case  "C": c = "Z";
		    	 break;
                } 
		     System.out.print(c);
		    
}
}
}
		     
	
	    


	/* 
//////////////======
        Scanner s = new Scanner(System.in);
       int num = Integer.parseInt(s.next());
        int count = 0;
        int answers[] = new int[3];
//        int ans =1;
//        int[] divisors = new int[9];
        do{
            int ans =1;
//            int[] divisors = new int[9];
        	int A = Integer.parseInt(s.next());
        	int B = Integer.parseInt(s.next());
        	System.out.println("A: "+ A);
          	System.out.println("B: "+ B);
            for(int i=2; i<=9; i++) {
            	
            	if(A==i || B==i);
            	else if(A%i ==0) {ans*=i;
            	System.out.println("current i: "+i+"\n answer after A: "+ ans);
            	}
            	else if(B%i==0) {
            		ans*=i;
            		System.out.println("current i: "+i+"\nanswer after B: "+ ans);
            	}
            	
            	
            }
            if(A>9) ans*=A;
            if(B>9) ans*=B;
            answers[count] = ans;
            
           count+=1;
        }while(count<num);
 
        for(int i=0; i<num; i++) {
        	System.out.println(answers[i]);
        }
        	//////////////======
        	 */
	/*
	  Scanner s = new Scanner(System.in);
        BigInteger A = s.nextBigInteger();
        BigInteger B = s.nextBigInteger();
        
        System.out.println(A.add(B));
	*/
	
	
	
	
	/*
     Scanner s = new Scanner(System.in);
        
        int cases = s.nextInt();
        int[] answers = new int[cases];
        for(int i=0; i<cases; i++){
            int A = s.nextInt();
            int B = s.nextInt();
            answers[i] = A+B;
        }
        for(int i=0; i<cases; i++){
            System.out.println(answers[i]);
        }	       	
        */
	
	
	
	
	/*
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
        */
	
	
	
//	
//	 Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i ;j++){
//               System.out.print("*"); 
//            }
//            System.out.println("");
//        }
	
	
	/*
	
	 Scanner s = new Scanner(System.in);
	int[] input = new int[8];
	String print= "";
	for(int i =0; i<input.length; i++) input[i] = s.nextInt();
	
	for(int i=1; i<input.length; i++) {
		if(input[i-1]== input[i] +1) {print = "descending";}
		else if(input[i-1]== input[i] -1) {print = "ascending";}
		else {print = "mixed"; break;}
	}
	
	System.out.println(print);
	 */
	
	
	
	
	
	/*
	
	//4344 
	
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
	*/
	
	
	
	
	
	
	/*
	
	   Scanner s = new Scanner(System.in);
         
         int sum = 0;
         
         for(int i=0; i<5; i++){
             sum +=Math.pow(s.nextInt(),2);
         }
         System.out.println(sum%10);
	
         */
//	
//Scanner s = new Scanner(System.in);	
//int n= s.nextInt();
//int start = s.nextInt();
//if(n%2==0&& start==0) for(int i=1; i<n; i++){
//if(start==0) start++;
//else start--;
//System.out.println(start);
//
//}
//else if(n%3==0 && start==1) for(int i=1; i<n; i++){
//if(start==1) start--;
//else start++;
//System.out.println(start);
//
//}
//else System.out.println("Love is open door");
//         
 
	/*

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
	
	}*/
//    Scanner s = new Scanner(System.in);
//	int max = 0;
//	int index=0;
//
//	for(int i=0; i<4; i++)
//	    max+=s.nextInt();
//
//	    for(int i =1; i<5; i++){
//	        int temp=0;
//	        for(int j = 0; j<4; j++){
//	            temp+=s.nextInt();
//	        }
//	        if(max<temp){
//	            max = temp;
//	            index=i;
//	                    }
//	    }
//	System.out.printf("%d %d", index+1, max);
//		
	
	
//	Scanner s = new Scanner(System.in);
//	        int num =0; 
//	        num = s.nextInt();
//	        num *=s.nextInt();
//	        num *=s.nextInt();
//	        
//	        int[] numbers = new int[10];
//	        
//	        do{
//	         numbers[num%10] +=1;
//	            if(num>=1)
//	            num = num/10;
//	           else break;
//	        }while(num>=1);
//	        
//	        for(int i=0; i<=9; i++) {
//	        	System.out.println(numbers[i]);
//	        }
//	        
//	
	
	
	
//Scanner s = new Scanner(System.in);
//	int max=0; 
//	int[] counts = new int [6];
//	int sum = s.nextInt();
//	max = sum;
//	for(int i=0; i<6; i++){
//	    if(i%2==0){
//	    sum+=s.nextInt();
//	    }
//	    else{
//	    sum-=s.nextInt();
//	    }
//	    counts[i] = sum;
//	    if(counts[i]>=max) max = counts[i];
//	}
//	System.out.println(max);
//	
//	

	
	
	
	
	
	
//	
//     Scanner s = new Scanner(System.in);
//        String word = s.next();
//     
//        word = word.toUpperCase();
//       
//        String[] word_chars = word.split("");
//        int[] alphabetCount = new int[26];
//      
//        for(int i=0; i<word.length(); i++){
//             alphabetCount[word_chars[i].charAt(0) - 65] ++;
//            
//        }
//       
//       int max=-100; 
//       char result = '?';
//for(int i=0; i<26; i++){
//	
//    if(max==alphabetCount[i])   { 
//    	result = '?';
//    
//    	}
//  if(alphabetCount[i]>max) {
//    	max = alphabetCount[i];
//    	result = (char)(i+'A');
//    			}
//}    
//
//System.out.println(result);

	
	
//	 Scanner s = new Scanner(System.in);
//      
//      String word = s.next();
//      int length = word.length();
//        for(int i=length; i>=1; i-=10){
//            if(word.length()<10) System.out.println(word);
//            else{
//        System.out.println(word.substring(0, 10));
//        word = word.substring(10);
//        }
//        }
	  

