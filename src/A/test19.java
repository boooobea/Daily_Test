package A;

import java.util.Scanner;

//반복문 10952 A+B 
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오 

public class test19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a+b==0) {
				break;
			}
			System.out.println(a+b);
			
		}
	}//main
}//end class
