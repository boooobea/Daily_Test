package B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//정렬 N개의 수가 주어졌을때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오
public class t_2750 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=i; j<arr.length; j++) {
				int temp;
				
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int a : arr) {
			System.out.println(a);
		}
		
	}//main
}//end class
