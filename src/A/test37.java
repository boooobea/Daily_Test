package A;

import java.io.IOException;
import java.util.Scanner;

//문자 11654번 아스키코드

//알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
//주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
public class test37 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.next().charAt(0);
		
		System.out.println(a);
		
//		int a = System.in.read();
//		System.out.println(a);
	}//main
}//end class
