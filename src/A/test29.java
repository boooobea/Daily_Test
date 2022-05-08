package A;

// 2588 
//(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
import java.util.Scanner;

public class test29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int b1 = b%10;
		int b2 = b%100/10;
		int b3 = b/100;

		System.out.println(a*b1);
		System.out.println(a*b2);
		System.out.println(a*b3);
		System.out.println(a*b);
		
	}//main
}//end class
