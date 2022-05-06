package B;

import java.util.Scanner;

//반복문 11022 A+B

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
public class tset15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		for(int i=1; i<=c; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #"+i+": "+a+" + "+b+" = " +(a+b));
		}
	}//main
}//end class
