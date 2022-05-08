package A;

import java.util.Arrays;
import java.util.Scanner;

//배열 10818 최소, 최대 
//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
public class test30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}//for

		int max = arr[0];
		int min = arr[0];
		
		for(int v : arr) {
			if(max<v){
				max = v;
			}
			if(min>v) {
				min = v;
			}
		}//enhanced for
		
		System.out.println(min + " " +max);
	}//main
}//end class
