package A;

import java.util.Scanner;
//조건문 2884 알람시계

/* 45분 일찍 알람 설정하기
 * 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 
 * 현재 상근이가 설정한 알람 시각이 주어졌을 때, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
 * 
 * 첫째줄에 두 정수 H , M이 주어진다. 이것은 설정한 알람시간 H시 M분을 의미한다. 
 * 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0이고 끝은 23:59이다.
 * 시간을 나타낼 때 불필요한 0은 사용하지 않는다. 
 * */
public class test05 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("알람을 입력하세요. H:M");
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		
		if(m<45) {
			h--;
			m = 60-(45-m);
			
			if(h<0) {
				h = 23;
			}//if
			
			System.out.println(h +" " +m);
		} else {
			System.out.println(h +" " +(m-45));
		}
	
		
		
	}//main
}//end class
