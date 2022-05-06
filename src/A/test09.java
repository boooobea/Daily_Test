package A;

import java.util.Scanner;
//반복문 10950 A+B

/* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오 */

public class test09 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int c = scanner.nextInt();
		
		for(int i=0; i<c; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a+b);
		}
						
	}//main

}//end class
