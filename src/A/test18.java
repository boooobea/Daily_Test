package A;

import java.util.Arrays;
import java.util.Scanner;

//반복문 10871번 x보다 작은수 
//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
//이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

public class test18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(x>arr[i]) {
				System.out.print(arr[i]+ " ");
			}
		}
		
	}//main
}//end class
