package dailyTestA;

import java.util.Scanner;

/* n이 주어졌을때, 1부터 n까지의 합을 구하는 프로그램을 작성하시오 */
public class test10 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum +=i;			
		}
		System.out.println(sum);
	}//main
}//end class
