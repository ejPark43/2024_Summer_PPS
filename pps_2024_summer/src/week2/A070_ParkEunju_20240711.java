package week2;
import java.util.*;
public class A070_ParkEunju_20240711 {

	
	 public static void main(String args[]){
	        // A070 카드2
	        Scanner s = new Scanner(System.in);
	        
	        Queue<Integer> q = new LinkedList<>(); // 큐 생성 
	        int n = s.nextInt();
	        
	        for(int i=1; i<=n; i++)
	            q.offer(i); // 1부터 n까지 값을 큐에 넣어줌. 맨 위가 1
	        
	        
	        while(q.size()>1){ // 큐에 들어있는 원소가 1개면 그만 
	    q.poll(); // 맨 위 카드 버림 
	    q.offer(q.poll()); // 위에서 버리고 난 다음 맨 위의 걸 아래로 넣음 
	    
	}
	        System.out.println(q.poll()); // 남은 것 출력 
	    }
}
