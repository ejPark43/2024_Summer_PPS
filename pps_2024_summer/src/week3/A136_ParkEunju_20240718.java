package week3;


import java.util.*;
public class A136_ParkEunju_20240718 {
// A136 문서 검색 
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String find = s.nextLine();
		
		int strlen = str.length(); //문자열 길이 미리 저장 
		int findlen=find.length(); // 찾을 단어 길이 미리 저장 
		
		str = str.replace(find, "");// 단어 내용을 모두 "" 빈칸으로 바꿈 
		System.out.println((strlen-str.length())/findlen); // ((원래 문자열 길이) - (변환된 문자열길이))/ (찾는단어길이) = 단어 개수    
		

		
	}
}
