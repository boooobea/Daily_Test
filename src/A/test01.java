package A;
import java.util.Scanner;
//조건문 1330 두 수 비교하기

//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오 
public class test01 {

	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("두 정수를 입력하세요.");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	if(num1>num2) {
		System.out.println(">");
	} else if(num1<num2){
		System.out.println("<");
	} else {
		System.out.println("==");
	}//if-else
		 
	}//main
	
}//end class
