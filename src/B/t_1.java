package B;

import java.util.Scanner;

//meter를 입력받아 km와 m로 출력하는 프로그램을 작성하시오 

public class t_1 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int meter = sc.nextInt();
		
		if(meter < 1000) {
			System.out.println(meter+"m");
		} else {
			System.out.println(meter/1000.0 + "k");
		}
	}//main
	
}//end class
