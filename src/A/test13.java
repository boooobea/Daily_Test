package A;

import java.util.Scanner;
//반복문 2741 찍기N

//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
public class test13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			System.out.println(i);
		}//for
	}//main
}//end class
