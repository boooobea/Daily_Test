package A;

import java.util.Scanner;

//반복문 2439번 별찍기 -2

public class test17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			for(int j=num; j>0; j--) {
				
				if(j>i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
	}//main
}//end class
