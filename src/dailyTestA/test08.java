package dailyTestA;

import java.util.Scanner;

public class test08 {
/* N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("구구단 N을 입력하세요.");
		int dan = scanner.nextInt();
		
		for(int i=dan; i<=dan; i++) {
			
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		
	}//main
}//end class
