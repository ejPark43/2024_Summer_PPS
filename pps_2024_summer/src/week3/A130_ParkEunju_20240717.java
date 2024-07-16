package week3;

import java.util.*;
public class A130_ParkEunju_20240717 {
//A130 제로 (여러 숫자가 들어올때 0이면 직전숫자 지움. 이 규칙을 적용하여 얻게 된 수들을 모두더한 값을 출력 )
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int k = Integer.parseInt(s.nextLine()); // 들어올 값 개수 
	
	int sum=0;
	Stack<Integer> stack = new Stack<>();

	for(int i=0; i<k; i++) {
		int curr = Integer.parseInt(s.nextLine()); 

		if(curr ==0) // 현재값이 0이면 직전값 pop 
			stack.pop();
		else stack.push(curr);// 현재값이 0이 아니라면 Push 

	}
	
	for(int o: stack) { // stack에 원소들 남아있을때 
		sum+=o; //남아있는 것들을 모두 sum에 더함 
		
	}
	System.out.println(sum);
	
	
	}

}
