package dailyTestA;

import java.util.Scanner;

public class test09 {
/* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수 두 개 입력하세요");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a+b);
		}
		
	}//main

}//end class
