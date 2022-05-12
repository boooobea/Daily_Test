package A;

import java.io.IOException;
import java.util.Scanner;

//문자 11720 숫자의 합
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
public class test38 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String str = sc.next();
		
		int sum = 0;
		for(int i=0; i<num; i++) {
			sum += str.charAt(i)-'0';
		}
		
		System.out.println(sum);
		
		
	}//main
}//end class
