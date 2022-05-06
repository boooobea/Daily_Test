package A;

import java.util.Scanner;
//반복문 2742 기찍N

//자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오. 
public class test12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i=a; i>0; i--) {
			System.out.println(i);
		}
	}//main
}//end class
