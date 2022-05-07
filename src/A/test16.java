package A;

import java.util.Scanner;

//반복문 2438 별찍기-1

//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
public class test16 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
	}//main
}//end class
