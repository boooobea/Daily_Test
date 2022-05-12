package A;

//반복문 1110 더하기싸이클
import java.util.Scanner;

public class t_1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int copy = num;
		
		int count = 0;
		
		while(true) {
			num = ((num%10)*10)+(((num%10)+(num/10))%10);
			count ++;
			
			if(copy == num) {
				break;
			}
		}//for:사이클 횟수 체크
				
		System.out.println(count);
	}//main
	
}//end class
