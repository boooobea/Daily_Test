package A;

import java.util.Scanner;
//조건문 2480 주사위 3개

/* 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임
 * 1) 같은 눈이 3개가 나오면 10,000원 +(같은눈)x1,000 원의 상금을 받게 된다.
 * 2) 같은 눈이 2개만 나오는 경우에는 1000원+(같은눈)x100 원의 상금을 받게 된다.
 * 3) 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)x100 원의 상금을 받게 된다. 
 * 예를 들어, 3개의 눈 3,3,6이 주어지면 상금은 1000 + 3 x 100으로 계산되어 1300원을 받게 된다.
 * 또 3개의 눈이 2,2,2로 주어지면 10000 + 2 x1000 으로 계산되어 12000원을 받게 된다.
 * 3개의 눈이 6,2,5로 주어지면 그 중 가장 큰 값이 6이므로 6x100으로 계산되어 600원을 상금으로 받게 된다.
 * 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성하시오 */
public class test07 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("주사위 값을 입력하세요");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int max = num1;
	
		if(num1<num2) {
			max = num2;
			if(num2<num3) {
				max=num3;
			}
		}//if
		
		if(num1==num2 | num1==num3) {
			if(num2==num3) {
				int a3 = 10000+(num1*1000);
				System.out.println(a3);
			} else {
				int b2 = 1000+(num1*100);
				System.out.println(b2);
			}//if-else
			
		} else {
			int c = max*100;
			System.out.println(c);
		}//if-else
		
			
		
	}//main
}//end class
