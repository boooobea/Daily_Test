package A;

import java.util.Scanner;
//조건문 2525 오븐시계

/*훈제오리구이를 시작하는 시각과 오븐구이를 하는데 필요한 시간이 분단위로 주어졌을 때 
 * 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오
 * 첫째 줄에는 현재시각이 나온다. 
 * 두번째 줄에는 요리하는데 필요한 시간이 분단위로 주어진다. */

public class test06 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("현재시각을 입력하세요.");
		int h = scanner.nextInt();
		int m = scanner.nextInt();
//		System.out.println("요리하는데 필요한 시간은 몇분입니까?");
		int cooktime = scanner.nextInt();
		
		m += cooktime;
		
		if(m > 59) {
			while(m>59) {
				h++;
				m -= 60;
			}//while
			
			if(h>23) {
				h=0;
			}//if
			
			}//if
			System.out.println(h+" "+m);
				
	}//main
}//end class
